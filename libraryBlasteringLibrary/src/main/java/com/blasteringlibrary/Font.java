package com.blasteringlibrary;

import java.util.Hashtable;

import android.content.Context;
import android.graphics.Typeface;

public class Font {
	
	private static final String url_font_philo = "font/Philosopher-Regular.ttf";
	private static final String url_font_ethon = "font/EthBlackEthon.ttf";
	
public static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();
	
	public static Typeface fontPhilo_Regular(Context ctx){
		synchronized (cache) {
			if(!cache.containsKey(url_font_philo)){
				try{
					Typeface t = Typeface.createFromAsset(ctx.getAssets(), url_font_philo);
					cache.put(url_font_philo, t);
				}catch(Exception e){
					return null;
				}
			}
			
			return cache.get(url_font_philo);
		}
	}
	
//	public static Typeface fontTitle(Context ctx){
//		synchronized (cache) {
//			if(!cache.containsKey(url_font_ethon)){
//				try{
//					Typeface t = Typeface.createFromAsset(ctx.getAssets(), url_font_ethon);
//					cache.put(url_font_ethon, t);
//				}catch(Exception e){
//					return null;
//				}
//			}
//			
//			return cache.get(url_font_ethon);
//		}
//	}

}
