//Copyright 2019 HP Inc.
package com.hp.composer.sdk.api.v1.resources.input.assetsLibrary;

public class AssetsLibraryResourceCreation {
	public AssetsLibraryResourceCreation(){}

	private String fileName;


	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("AssetsLibraryResourceCreation:{");
		stringBuilder.append("fileName:").append(fileName).append(", ");
		stringBuilder.append("}");

		return stringBuilder.toString();
	}
}
