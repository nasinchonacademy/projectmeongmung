$(document).ready(function() {
    $("#btnradio1").on("click", function() {
        $("#sosPage").load("/soshospitallist/content1");
    });

    $("#btnradio2").on("click", function() {
        $("#sosPage").load("/soshospitallist/content2");
    });
});