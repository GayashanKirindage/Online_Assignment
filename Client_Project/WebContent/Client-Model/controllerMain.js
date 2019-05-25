$(document).on("click", "#btnLogin",function()
{
	var result = isValidFormLogin();
	if(result=="true")
	{
		$("#formLogin").submit();
	}
	else
	{
		$("#divStsMsgLogin").submit();
	}
});

function isValidFormLogin()
{
	if($.trim($("#shipName").val())=="")
	{
		return "Enter Ship name";
	}
	if($.trim($("#shipName").val())=="")
	{
		return "Enter Ship name";
	}
}

function isValidFormLogin()
{
	if($.trim($("#shippingCost").val())=="")
	{
		return "Enter Shipping cost";
	}
	if($.trim($("#shippingCost").val())=="")
	{
		return "Enter Shipping cost";
	}
}

function isValidFormLogin()
{
	if($.trim($("#departFrom").val())=="")
	{
		return "Enter Depart from";
	}
	if($.trim($("#departFrom").val())=="")
	{
		return "Enter Depart from";
	}
}
function isValidFormLogin()
{
	if($.trim($("#depdate").val())=="")
	{
		return "Enter departdate";
	}
	if($.trim($("#depdate").val())=="")
	{
		return "Enter departdate";
	}
}
function isValidFormLogin()
{
	if($.trim($("#des").val())=="")
	{
		return "Enter destination";
	}
	if($.trim($("#des").val())=="")
	{
		return "Enter destination";
	}
}
function isValidFormLogin()
{
	if($.trim($("#cfpwd").val())=="")
	{
		return "Enter Arrivale date time";
	}
	if($.trim($("#cfpwd").val())=="")
	{
		return "Enter Arrivale date time";
	}
}
function isValidFormLogin()
{
	if($.trim($("#status").val())=="")
	{
		return "Enter status";
	}
	if($.trim($("#status").val())=="")
	{
		return "Enter status";
	}
}
function isValidFormLogin()
{
	if($.trim($("#company").val())=="")
	{
		return "Enter company name";
	}
	if($.trim($("#company").val())=="")
	{
		return "Enter company name";
	}
}

function isValidFormLogin()
{
	if($.trim($("#cont").val())=="")
	{
		return "Enter Contactact no";
	}
	if($.trim($("#cont").val())=="")
	{
		return "Enter Contactact no";
	}
}
function isValidFormLogin()
{
	if($.trim($("#desc").val())=="")
	{
		return "Enter Description";
	}
	if($.trim($("#desc").val())=="")
	{
		return "Enter Description";
	}
}
$(document).on("click", "#btnSave",function()
{
	var result = isValidFormLogin();
	if(result=="true")
	{
		$("#formItem").submit();
	}
	else
	{
		$("#divStsMsgItem").html(result);
	}
});

$(document).on("click", "#btnEdit",function()
{
	$("#hidMode").val("update");
	$("#hidID").val($(this).attr("param"));
	$("#txtItemName").val($(this).closest("tr").find('td:eq(1)').text());
	$("#txtItemDesc").val($(this).closest("tr").find('td:eq(2)').text());
});

$(document).on("click", "#btnEdit",function()
{
	$("#hidMode").val("remove");
	$("#hidID").val($(this).attr("param"));
	var res = confirm("Are you sure?");
		if(res == true){
			$("#formItems").submit();
		}
});
