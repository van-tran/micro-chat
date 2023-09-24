package com.example.chat.dto;

import com.example.chat.constants.ConversationType;
import lombok.Data;

import java.util.List;

@Data
public class ChatCreateRequest{
	private List<MembersItem> members;
	private String name;
	private String id;
	private ConversationType type;
}