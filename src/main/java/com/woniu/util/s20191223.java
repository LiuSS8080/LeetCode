package com.woniu.util;

import java.util.HashMap;
import java.util.Map;

public class s20191223 {
	/**
	 * 535. TinyURL 的加密与解密 TinyURL是一种URL简化服务，
	 * 比如：当你输入一个URL https://leetcode.com/problems/design-tinyurl 时，
	 * 它将返回一个简化的URL http://tinyurl.com/4e9iAk. 要求：设计一个 TinyURL
	 * 的加密 encode 和解密 decode 的方法。 你的加密和解密算法如何设计和运作是没有限制的，你只需要保证一个URL可以被加密成一个TinyURL，
	 * 并且这个TinyURL可以用解密方法恢复成原本的URL。
	 */
	// Encodes a URL to a shortened URL.
	Map<Integer, String> map = new HashMap<Integer, String>();

	public String encode(String longUrl) {
		int shortUrl = longUrl.hashCode();
		map.put(shortUrl, longUrl);
		return "http://tinyurl.com/" + shortUrl;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String replace = shortUrl.replace("http://tinyurl.com/", "");
		return map.get(Integer.parseInt(replace));
	}

	/**
	 * 1108. IP 地址无效化 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。 
	 * 所谓无效化 IP 地址，其实就是用"[.]" 代替了每个 "."。
	 * 
	 * @param address
	 * @return
	 */
	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}

}
