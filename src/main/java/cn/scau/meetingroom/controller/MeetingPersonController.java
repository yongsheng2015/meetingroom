package cn.scau.meetingroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.scau.meetingroom.service.MeetingPersonService;

@Controller
@RequestMapping("")
public class MeetingPersonController {
	@Autowired
	MeetingPersonService meetingPersonService;
}