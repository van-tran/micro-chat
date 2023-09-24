package com.example.chat.dto;

import java.util.List;
import lombok.Data;

@Data
public class Message{
	private List<AttachmentsItem> attachments;
	private String conversation;
}