package com.abc.pushtrip.trade.vo;

public class TradeForumVO {
	
	private String tradeId;
	private String userId;
	private String title;
	private String price;
	private String content;
	private String pictureFile;
	private int view;
	private String deleteYn;
	private String insertDate;
	private String updateDate;
	
	
	public TradeForumVO() {
		
	}

 
	public TradeForumVO(String tradeId, String userId, String title, String price, String content, String pictureFile,
			int view, String deleteYn, String insertDate, String updateDate) {
		
		this.tradeId = tradeId;
		this.userId = userId;
		this.title = title;
		this.price = price;
		this.content = content;
		this.pictureFile = pictureFile;
		this.view = view;
		this.deleteYn = deleteYn;
		this.insertDate = insertDate;
		this.updateDate = updateDate;
	}


	public String getTradeId() {
		return tradeId;
	}


	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getPictureFile() {
		return pictureFile;
	}


	public void setPictureFile(String pictureFile) {
		this.pictureFile = pictureFile;
	}


	public int getView() {
		return view;
	}


	public void setView(int view) {
		this.view = view;
	}


	public String getDeleteYn() {
		return deleteYn;
	}


	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}


	public String getInsertDate() {
		return insertDate;
	}


	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}


	public String getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
}
