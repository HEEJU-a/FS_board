package com.fusion.board1.board;

public class BoardDTO{
	private int iboard;
	private int startIdx;
    private int recordCnt = 10;
    private int searchType;
    private String searchText;
    private int iuser;
    private int page = 1;
    
    @Override
	public String toString() {
		return "BoardDTO [iboard=" + iboard + ", startIdx=" + startIdx + ", recordCnt=" + recordCnt + ", searchType="
				+ searchType + ", searchText=" + searchText + ", iuser=" + iuser + ", page=" + page
				+ ", getSearchType()=" + getSearchType() + ", getSearchText()=" + getSearchText() + ", getIboard()="
				+ getIboard() + ", getStartIdx()=" + getStartIdx() + ", getRecordCnt()=" + getRecordCnt()
				+ ", getIuser()=" + getIuser() + ", getPage()=" + getPage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getSearchType() {
		return searchType;
	}
	public void setSearchType(int searchType) {
		this.searchType = searchType;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	
	public int getIboard() {
		return iboard;
	}
	public void setIboard(int iboard) {
		this.iboard = iboard;
	}
	public int getStartIdx() {
		return startIdx;
	}
	public void setStartIdx(int startIdx) {
		this.startIdx = startIdx;
	}
	public int getRecordCnt() {
		return recordCnt;
	}
	public void setRecordCnt(int recordCnt) {
		this.recordCnt = recordCnt;
	}
	public int getIuser() {
		return iuser;
	}
	public void setIuser(int iuser) {
		this.iuser = iuser;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
    
	
    

}
