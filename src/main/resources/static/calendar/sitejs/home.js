
  let i = 0;
   $("#btnAdd").click( function () {
       i++
       const newForm = `<h2>Yeni Üye</h2>
        <form>
            <input id="`+i+`_name" placeholder="Adı" class="form-control" required />
            <input id="`+i+`_color" placeholder="Renk" class="form-control" required  />
        </form>`

        $("#addForms").append( newForm );

    } );


   $("#btnsubmitSend").click( function () {
       console.log("i:" + i)
       for (let j = 0; j <= i; j++) {
           const name = $("#"+j+"_name").val();
           const color = $("#"+j+"_color").val();

           console.log( name, color )
       }
   })


