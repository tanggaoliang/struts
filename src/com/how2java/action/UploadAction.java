package com.how2java.action;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;

public class UploadAction {
    File image;
    String imageFileName;
    String imageContentType;

    public String upload() {
//        System.out.println(image);
//        System.out.println(imageFileName);
//        System.out.println(imageContentType);
        String realPath = ServletActionContext.getServletContext().getRealPath("/images");
        if (image != null) {
            imageFileName = String.valueOf(System.currentTimeMillis()) + ".jpg";
            System.out.println("filename is " + imageFileName);
            File saveFile = new File(new File(realPath), imageFileName);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
                System.out.println("创建文件加成功");
            } else {
                System.out.println("文件夹已经存在");
            }
            try {
                FileUtils.copyFile(image, saveFile);
            } catch (Exception e) {
                e.printStackTrace();
                return "fail";
            }

        }
        return "success";
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }
}
