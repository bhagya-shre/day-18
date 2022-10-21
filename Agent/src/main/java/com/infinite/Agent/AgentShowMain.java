package com.infinite.Agent;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.infinite.Agent.Agent;

public class AgentShowMain {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent>  agentList = query.list();
		for (Agent agent:agentList) {
			System.out.println(agent);
			

	}

}
}
