package com.tszj.dashboard.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * User: ck01-392
 * Date: 13-11-29
 * Time: 下午3:25
 *
 * @author tong
 */
public class BeanUtil implements ApplicationContextAware {

	public static ApplicationContext context;

	public static <T> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		BeanUtil.context = applicationContext;
	}
}
