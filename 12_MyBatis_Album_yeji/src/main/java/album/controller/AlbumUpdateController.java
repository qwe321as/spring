package album.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumUpdateController {
	final String command = "update.ab";
	final String getPage = "AlbumUpdateForm"; 
	final String gotoPage = "redirect:/list.ab"; 
	
	
	@Autowired
	private AlbumDao albumDao;
	
	// AlbumList.jsp에서 수정 클릭
	@RequestMapping(value = command, method=RequestMethod.GET)
	public String doAction(@RequestParam("num") int num, Model model) {
		
		AlbumBean album = albumDao.selectOne(num);
		model.addAttribute("album", album);
		return getPage; 
	}
	
	// AlbumForm.jsp에서 submit 클릭
	@RequestMapping(value = command, method=RequestMethod.POST)
	public ModelAndView doAction(@ModelAttribute("album") @Valid AlbumBean album,
							BindingResult result) {
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println(result.hasErrors());
		if(result.hasErrors()) {
			mav.setViewName(getPage);
			return mav;
		}
		int cnt = albumDao.update(album);
		if(cnt>0) {
			mav.setViewName(gotoPage);
		}else {
			mav.setViewName(getPage);
		}
		return mav;
	}
}
