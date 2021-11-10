package com.run.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "months")
public class Excel{
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="state")
	  private String State;
	@Column(name="state_id")
	  private Integer state_id;
	@Column(name="month")
	private Integer month;
	@Column(name="year")
	private Integer year;
	@Column(name="1st")
 private Integer first;
	@Column(name="2nd")
 private Integer second;
	@Column(name="3rd")
 private Integer third;
	@Column(name="4th")
 private Integer fourth;
	@Column(name="5th")
 private Integer fifth;
	@Column(name="6th")
 private Integer six;
	@Column(name="7th")
 private Integer seven;
	@Column(name="8th")
 private Integer eight;
	@Column(name="9th")
 private Integer nine;
	@Column(name="10th")
 private Integer ten;
	@Column(name="11th")
 private Integer eleven;
	@Column(name="12th")
 private Integer twelve;
	@Column(name="13th")
 private Integer thirteen;
	@Column(name="14th")
 private Integer fourteen;
	@Column(name="15th")
 private Integer fifteen ;
	@Column(name="16th")
 private Integer sixteen;
	@Column(name="17th")
 private Integer seventeen;
	@Column(name="18th")
 private Integer eighteen;
	@Column(name="19th")
 private Integer nineteen ;
	@Column(name="20th")
 private Integer twenty;
	@Column(name="21st")
 private Integer twentyone;
	@Column(name="22nd")
 private Integer twentytwo;
	@Column(name="23rd")
 private Integer twentythree;
	@Column(name="24th")
 private Integer twentyfour;
	@Column(name="25th")
 private Integer twentyfive;
	@Column(name="26th")
 private Integer twentysix;
	@Column(name="27th")
 private Integer twentyseven;
	@Column(name="28th")
 private Integer twentyeight;
	@Column(name="29th")
 private Integer twentynine;
	@Column(name="30th")
 private Integer thirty;
	@Column(name="31st")
 private Integer thirtyfirst;
	@Column(name="total")
 private Integer total;
	@Column(name="zone_name")
 private String zone_name;
public Excel(Integer id, String state, Integer state_id, Integer month, Integer year, Integer first, Integer second,
		Integer third, Integer fourth, Integer fifth, Integer six, Integer seven, Integer eight, Integer nine,
		Integer ten, Integer eleven, Integer twelve, Integer thirteen, Integer fourteen, Integer fifteen,
		Integer sixteen, Integer seventeen, Integer eighteen, Integer nineteen, Integer twenty, Integer twentyone,
		Integer twentytwo, Integer twentythree, Integer twentyfour, Integer twentyfive, Integer twentysix,
		Integer twentyseven, Integer twentyeight, Integer twentynine, Integer thirty, Integer thirtyfirst,
		Integer total, String zone_name) {
	super();
	this.id = id;
	State = state;
	this.state_id = state_id;
	this.month = month;
	this.year = year;
	this.first = first;
	this.second = second;
	this.third = third;
	this.fourth = fourth;
	this.fifth = fifth;
	this.six = six;
	this.seven = seven;
	this.eight = eight;
	this.nine = nine;
	this.ten = ten;
	this.eleven = eleven;
	this.twelve = twelve;
	this.thirteen = thirteen;
	this.fourteen = fourteen;
	this.fifteen = fifteen;
	this.sixteen = sixteen;
	this.seventeen = seventeen;
	this.eighteen = eighteen;
	this.nineteen = nineteen;
	this.twenty = twenty;
	this.twentyone = twentyone;
	this.twentytwo = twentytwo;
	this.twentythree = twentythree;
	this.twentyfour = twentyfour;
	this.twentyfive = twentyfive;
	this.twentysix = twentysix;
	this.twentyseven = twentyseven;
	this.twentyeight = twentyeight;
	this.twentynine = twentynine;
	this.thirty = thirty;
	this.thirtyfirst = thirtyfirst;
	this.total = total;
	this.zone_name = zone_name;
}
public Excel() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public Integer getState_id() {
	return state_id;
}
public void setState_id(Integer state_id) {
	this.state_id = state_id;
}
public Integer getMonth() {
	return month;
}
public void setMonth(Integer month) {
	this.month = month;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public Integer getFirst() {
	return first;
}
public void setFirst(Integer first) {
	this.first = first;
}
public Integer getSecond() {
	return second;
}
public void setSecond(Integer second) {
	this.second = second;
}
public Integer getThird() {
	return third;
}
public void setThird(Integer third) {
	this.third = third;
}
public Integer getFourth() {
	return fourth;
}
public void setFourth(Integer fourth) {
	this.fourth = fourth;
}
public Integer getFifth() {
	return fifth;
}
public void setFifth(Integer fifth) {
	this.fifth = fifth;
}
public Integer getSix() {
	return six;
}
public void setSix(Integer six) {
	this.six = six;
}
public Integer getSeven() {
	return seven;
}
public void setSeven(Integer seven) {
	this.seven = seven;
}
public Integer getEight() {
	return eight;
}
public void setEight(Integer eight) {
	this.eight = eight;
}
public Integer getNine() {
	return nine;
}
public void setNine(Integer nine) {
	this.nine = nine;
}
public Integer getTen() {
	return ten;
}
public void setTen(Integer ten) {
	this.ten = ten;
}
public Integer getEleven() {
	return eleven;
}
public void setEleven(Integer eleven) {
	this.eleven = eleven;
}
public Integer getTwelve() {
	return twelve;
}
public void setTwelve(Integer twelve) {
	this.twelve = twelve;
}
public Integer getThirteen() {
	return thirteen;
}
public void setThirteen(Integer thirteen) {
	this.thirteen = thirteen;
}
public Integer getFourteen() {
	return fourteen;
}
public void setFourteen(Integer fourteen) {
	this.fourteen = fourteen;
}
public Integer getFifteen() {
	return fifteen;
}
public void setFifteen(Integer fifteen) {
	this.fifteen = fifteen;
}
public Integer getSixteen() {
	return sixteen;
}
public void setSixteen(Integer sixteen) {
	this.sixteen = sixteen;
}
public Integer getSeventeen() {
	return seventeen;
}
public void setSeventeen(Integer seventeen) {
	this.seventeen = seventeen;
}
public Integer getEighteen() {
	return eighteen;
}
public void setEighteen(Integer eighteen) {
	this.eighteen = eighteen;
}
public Integer getNineteen() {
	return nineteen;
}
public void setNineteen(Integer nineteen) {
	this.nineteen = nineteen;
}
public Integer getTwenty() {
	return twenty;
}
public void setTwenty(Integer twenty) {
	this.twenty = twenty;
}
public Integer getTwentyone() {
	return twentyone;
}
public void setTwentyone(Integer twentyone) {
	this.twentyone = twentyone;
}
public Integer getTwentytwo() {
	return twentytwo;
}
public void setTwentytwo(Integer twentytwo) {
	this.twentytwo = twentytwo;
}
public Integer getTwentythree() {
	return twentythree;
}
public void setTwentythree(Integer twentythree) {
	this.twentythree = twentythree;
}
public Integer getTwentyfour() {
	return twentyfour;
}
public void setTwentyfour(Integer twentyfour) {
	this.twentyfour = twentyfour;
}
public Integer getTwentyfive() {
	return twentyfive;
}
public void setTwentyfive(Integer twentyfive) {
	this.twentyfive = twentyfive;
}
public Integer getTwentysix() {
	return twentysix;
}
public void setTwentysix(Integer twentysix) {
	this.twentysix = twentysix;
}
public Integer getTwentyseven() {
	return twentyseven;
}
public void setTwentyseven(Integer twentyseven) {
	this.twentyseven = twentyseven;
}
public Integer getTwentyeight() {
	return twentyeight;
}
public void setTwentyeight(Integer twentyeight) {
	this.twentyeight = twentyeight;
}
public Integer getTwentynine() {
	return twentynine;
}
public void setTwentynine(Integer twentynine) {
	this.twentynine = twentynine;
}
public Integer getThirty() {
	return thirty;
}
public void setThirty(Integer thirty) {
	this.thirty = thirty;
}
public Integer getThirtyfirst() {
	return thirtyfirst;
}
public void setThirtyfirst(Integer thirtyfirst) {
	this.thirtyfirst = thirtyfirst;
}
public Integer getTotal() {
	return total;
}
public void setTotal(Integer total) {
	this.total = total;
}
public String getZone_name() {
	return zone_name;
}
public void setZone_name(String zone_name) {
	this.zone_name = zone_name;
}
@Override
public String toString() {
	return "Excel [id=" + id + ", State=" + State + ", state_id=" + state_id + ", month=" + month + ", year=" + year
			+ ", first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + ", fifth=" + fifth
			+ ", six=" + six + ", seven=" + seven + ", eight=" + eight + ", nine=" + nine + ", ten=" + ten + ", eleven="
			+ eleven + ", twelve=" + twelve + ", thirteen=" + thirteen + ", fourteen=" + fourteen + ", fifteen="
			+ fifteen + ", sixteen=" + sixteen + ", seventeen=" + seventeen + ", eighteen=" + eighteen + ", nineteen="
			+ nineteen + ", twenty=" + twenty + ", twentyone=" + twentyone + ", twentytwo=" + twentytwo
			+ ", twentythree=" + twentythree + ", twentyfour=" + twentyfour + ", twentyfive=" + twentyfive
			+ ", twentysix=" + twentysix + ", twentyseven=" + twentyseven + ", twentyeight=" + twentyeight
			+ ", twentynine=" + twentynine + ", thirty=" + thirty + ", thirtyfirst=" + thirtyfirst + ", total=" + total
			+ ", zone_name=" + zone_name + "]";
}



}