package com.fusion.board1.board;

public class BoardVO extends BoardDTO{
	private int iboard;
	private String title;
	private String ctnt;
	private String nm;
	private String regdt;
	private int views;
	private String tag;
	private int board_num;
	private int file_number;
	private String org_file_nm;
	private String stored_file_nm;
	private int file_size;
	private String regdate;
	private String del_gb;
	private int size;
	
	
	@Override
	public String toString() {
		return "BoardVO [iboard=" + iboard + ", title=" + title + ", ctnt=" + ctnt + ", nm=" + nm + ", regdt=" + regdt
				+ ", views=" + views + ", tag=" + tag + ", board_num=" + board_num + ", file_number=" + file_number
				+ ", org_file_nm=" + org_file_nm + ", stored_file_nm=" + stored_file_nm + ", file_size=" + file_size
				+ ", regdate=" + regdate + ", del_gb=" + del_gb + ", size=" + size + ", getFile_number()="
				+ getFile_number() + ", getOrg_file_nm()=" + getOrg_file_nm() + ", getStored_file_nm()="
				+ getStored_file_nm() + ", getFile_size()=" + getFile_size() + ", getRegdate()=" + getRegdate()
				+ ", getDel_gb()=" + getDel_gb() + ", getSize()=" + getSize() + ", getTag()=" + getTag()
				+ ", getBoard_num()=" + getBoard_num() + ", getIboard()=" + getIboard() + ", getTitle()=" + getTitle()
				+ ", getCtnt()=" + getCtnt() + ", getNm()=" + getNm() + ", getRegdt()=" + getRegdt() + ", getViews()="
				+ getViews() + ", toString()=" + super.toString() + ", getSearchType()=" + getSearchType()
				+ ", getSearchText()=" + getSearchText() + ", getStartIdx()=" + getStartIdx() + ", getRecordCnt()="
				+ getRecordCnt() + ", getIuser()=" + getIuser() + ", getPage()=" + getPage() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public int getFile_number() {
		return file_number;
	}
	public void setFile_number(int file_number) {
		this.file_number = file_number;
	}
	public String getOrg_file_nm() {
		return org_file_nm;
	}
	public void setOrg_file_nm(String org_file_nm) {
		this.org_file_nm = org_file_nm;
	}
	public String getStored_file_nm() {
		return stored_file_nm;
	}
	public void setStored_file_nm(String stored_file_nm) {
		this.stored_file_nm = stored_file_nm;
	}
	public int getFile_size() {
		return file_size;
	}
	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getDel_gb() {
		return del_gb;
	}
	public void setDel_gb(String del_gb) {
		this.del_gb = del_gb;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public int getIboard() {
		return iboard;
	}
	public void setIboard(int iboard) {
		this.iboard = iboard;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getRegdt() {
		return regdt;
	}
	public void setRegdt(String regdt) {
		this.regdt = regdt;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}



	
}
