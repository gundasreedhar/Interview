package SrinivasPrograms;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {
	public static void main(String[] args) {
		ServiceCustomer s1 = new ServiceCustomer("vodafone", "abc");
		ServiceCustomer s2 = new ServiceCustomer("vodafone", "efg");
		ServiceCustomer s3 = new ServiceCustomer("airtel", "pqr");
		ServiceCustomer s4 = new ServiceCustomer("airtel", "xyz");
		ServiceCustomer s5 = new ServiceCustomer("vodafone", "sdcds");
		List<ServiceCustomer> list = new ArrayList<ServiceCustomer>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Map<String, List<String>> map = resultMap(list);
		Set<Entry<String, List<String>>> set = map.entrySet();
		for (Entry<String, List<String>> serviceCustomer : set) {
			System.out.println("The number of consumers for producer " + serviceCustomer.getKey() + " are "
					+ serviceCustomer.getValue().size());
		}
	}

	static Map<String, List<String>> resultMap(List<ServiceCustomer> list) {
		Map<String, List<String>> hm = new HashMap<String, List<String>>();
		for (ServiceCustomer serviceCustomer : list) {
			if (hm.containsKey(serviceCustomer.producer)) {
				List<String> producer = hm.get(serviceCustomer.producer);
				producer.add(serviceCustomer.consumer);
			} else {
				List<String> service = new ArrayList<String>();
				service.add(serviceCustomer.consumer);
				hm.put(serviceCustomer.producer, service);
			}
		}
		return hm;
	}
}

class ServiceCustomer {
	String producer;
	String consumer;

	ServiceCustomer(String producer, String consumer) {
		this.producer = producer;
		this.consumer = consumer;
	}
}