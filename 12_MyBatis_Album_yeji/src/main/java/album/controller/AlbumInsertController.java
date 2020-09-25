package album.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumInsertController {
	final String Command = "insert.ab";
	final String getPage="AlbumInsertForm";
	final String gotoPage = "redirect:/list.ab";
	@Autowired
	//@Qualifier(myAlbumDao);
	private AlbumDao albumDao;
	
	@RequestMapping(value=Command, method = RequestMethod.GET )
	public String doinsert() {
		return getPage;
	}
	@RequestMapping(value =Command, method = RequestMethod.POST)
	public ModelAndView doinsert(@Valid AlbumBean bean, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			System.out.println("오류발생");
			//return getPage;
			mav.setViewName(getPage);
			return mav;
		}
		int cnt = albumDao.insert(bean);
		System.out.println("cnt: "+cnt); 
		mav.setViewName(gotoPage);
		return mav;
	}
}
