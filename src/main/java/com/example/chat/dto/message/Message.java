package com.example.chat.dto.message;

import java.util.List;
import lombok.Data;

@Data
public class Message{
	private List<AttachmentsItem> attachments;
	private String conversation;
}