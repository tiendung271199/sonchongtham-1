<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
		  <div class="col-md-10">
				<c:if test="${not empty cat}">
				<form id="formUpdateCat" action="" method="POST" >
	  			<div class="row">
	  				<div class="col-md-12 panel-info">
			  			<div class="content-box-header panel-heading">
		  					<div class="panel-title ">Sửa danh mục</div>
			  			</div>
			  			<div class="content-box-large box-with-header">
				  			<div>
								<div class="row mb-10"></div>
								
								
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="cname">Tên danh mục</label>
											<input type="text" name="cname" class="form-control" value="${cat.cname}">
											<form:errors path="cat.cname" cssClass="err"/>
										</div>
										
									</div>

									<div class="col-sm-6"></div>

								</div>
								<hr>
								<div class="row">
									<div class="col-sm-12">
										<input type="submit" value="Sửa" class="btn btn-success" />
										<input type="reset" value="Nhập lại" class="btn btn-default" />
									</div>
								</div>
								
							</div>
						</div>
			  		</div>
	  			</div><!-- /.row col-size -->
	  		</form>
	  		</c:if>
		  </div><!-- /.col-md-10 -->
		