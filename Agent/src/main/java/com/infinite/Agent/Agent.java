package com.infinite.Agent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent")
public class Agent {

		@Id
		@Column(name="AgentId")
		private int AgentId;
		
		@Column(name="Name")
		private String Name;
		
		@Column(name="City")
		private String City;
		
		@Column(name="Gender")
		private String Gender;
		
		@Column(name="MaritalStatus")
		private int MaritalStatus;
		
		@Column(name="Premium")
		private double Premium;
	
		
		@Override
		public String toString() {
			return "Agent [AgentId=" + AgentId + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
					+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
		}
		public int getAgentId() {
			return AgentId;
		}
		public void setAgentId(int agentId) {
			AgentId = agentId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public int getMaritalStatus() {
			return MaritalStatus;
		}
		public void setMaritalStatus(int maritalStatus) {
			MaritalStatus = maritalStatus;
		}
		public double getPremium() {
			return Premium;
		}
		public void setPremium(double premium) {
			Premium = premium;
		}
		public Agent(int agentId, String name, String city, String gender, int maritalStatus, double premium) {
			super();
			AgentId = agentId;
			Name = name;
			City = city;
			Gender = gender;
			MaritalStatus = maritalStatus;
			Premium = premium;
		}
		public Agent() {
			
		}
		
		

}
