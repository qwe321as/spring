package album.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("myAlbumDao")
public class AlbumDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	public int insert(AlbumBean bean) {
		//String sql ="insert into albums values
		int cnt = sqlSessionTemplate.insert("album.AlbumBean.Insertab",bean);
		System.out.println("insert: "+cnt);
		return cnt;
	}
	public int update(AlbumBean bean) {
		//String sql ="insert into albums values
		System.out.println(bean.getTitle());
		int cnt = sqlSessionTemplate.update("album.AlbumBean.Updateab",bean);
		System.out.println("Updateab: "+cnt);
		return cnt;
	}
	public List<AlbumBean> selectAll(Paging pageInfo, Map<String,String> map) {
		List<AlbumBean> list = new ArrayList<AlbumBean>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		list = sqlSessionTemplate.selectList("album.AlbumBean.SelectAll",map,rowBounds);
		return list;
	}
	public AlbumBean selectOne(int num) {
		AlbumBean album = null;
		album = sqlSessionTemplate.selectOne("album.AlbumBean.SelectOne",num);
		return album;
	}
	public int delete(int num) {
		int cnt = sqlSessionTemplate.delete("album.AlbumBean.Deleteab",num);
		return cnt;
	}
	public int getTotalCount() {
		int cnt = sqlSessionTemplate.selectOne("album.AlbumBean.GetTotalCount");
		return cnt;
	}
}
/* autowired 다른곳에서 만든 객체를 찾아서 넣을때 */