//Copyright 2019 HP Inc.
package com.hp.composer.sdk.api.v1.resources.input.impositionTemplate;


public class ImpositionTemplateResource {
  public ImpositionTemplateResource(){}

  private Output output;

  private String fileName;

  public Output getOutput() {
    return output;
  }

  public void setOutput(Output output) {
    this.output = output;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public String toString(){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ImpositionTemplateResource:{");

    stringBuilder.append("fileName:").append(fileName).append(", ");

    stringBuilder.append("output:").append(output).append(", ");

    stringBuilder.append("}");

    return stringBuilder.toString();
  }

}
