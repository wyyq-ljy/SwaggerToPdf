# SwaggerToPdf

# 使用方法
执行

mvn swagger2markup:convertSwagger2markup

mvn generate-resources

出现中文乱码问题，需要用asciidoctorj-pdf-1.5.0-alpha.10.1.jar代替默认的jar包，在这里面添加了几个中文字库，解决乱码问题
