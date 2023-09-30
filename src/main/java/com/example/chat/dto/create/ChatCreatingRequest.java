package com.example.chat.dto.create;

import com.example.chat.constants.ConversationType;
import lombok.Data;

import java.util.List;

@Data
public class ChatCreatingRequest {
	private List<MembersItem> members;
	private String name;
	private String id;
	private ConversationType type;
}