package mx.tecnm.tepic.ladm_u2_practica1_presentaciondiamuertos

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.View

class Lienzo(act:MainActivity):View(act){
    val principal = act
    val tumba1 = BitmapFactory.decodeResource(principal.resources,R.drawable.tumba)
    val tumba2 = BitmapFactory.decodeResource(principal.resources,R.drawable.tumba)
    val tumba3 = BitmapFactory.decodeResource(principal.resources,R.drawable.tumba)
    val tumba4 = BitmapFactory.decodeResource(principal.resources,R.drawable.tumba)
    val catrina = BitmapFactory.decodeResource(principal.resources,R.drawable.catrina)
    val mano = BitmapFactory.decodeResource(principal.resources,R.drawable.mano)
    val mano2 = BitmapFactory.decodeResource(principal.resources,R.drawable.mano)
    val mano3 = BitmapFactory.decodeResource(principal.resources,R.drawable.mano)
    val cuervo = BitmapFactory.decodeResource(principal.resources,R.drawable.cuervo)
    var posX = 180f
    var posX2 = 450f
    var posX3 = 900f
    var posX4 = 1200f
    var posX5 = 1500f
    var posX6 = 50f
    var posX7 = 1080f
    var posX8 = 900f
    var posX9 = 1500f

    //catrina
    val movimientoCatrina = object:CountDownTimer(200,80){
        override fun onTick(p0: Long) {
            posX5 -= 5
            if(posX5<-500) posX5 = 2200f
            invalidate()  //forzas a onDraw a volverse a llamar, para repintar al trineo en nueva posicion
        }

        override fun onFinish(){
            start()
        }
    }

    //cuervo
    val movimientoCuervo = object:CountDownTimer(200,80){
        override fun onTick(p0: Long) {
            posX9 -= 5
            if(posX9<-500) posX9 = 2200f
            invalidate()  //forzas a onDraw a volverse a llamar, para repintar al trineo en nueva posicion
        }

        override fun onFinish(){
            start()
        }
    }

    //CONSTRUCTOR
    init {
        movimientoCatrina.start()
        movimientoCuervo.start()

    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p = Paint()

        c.drawColor(Color.BLUE)

        //luna
        p.style = Paint.Style.FILL
        p.color = Color.YELLOW
        c.drawCircle(690f,100f,80f,p)

        //nube centro
        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(740f,180f,80f,p)


        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(820f,180f,80f,p)

        //nube izq
        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(200f,120f,80f,p)

        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(300f,120f,80f,p)

        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(400f,120f,80f,p)

        //nube derecha
        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(1100f,120f,80f,p)

        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(1200f,120f,80f,p)

        p.style = Paint.Style.FILL
        p.color = Color.DKGRAY
        c.drawCircle(1300f,120f,80f,p)

        //montañas
        p.style = Paint.Style.FILL
        p.color = Color.rgb(128,60,0)
        c.drawCircle(350f,900f,500f,p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(350f,900f,500f,p)


        //Montaña 2
        p.style = Paint.Style.FILL
        p.color = Color.rgb(128,60,0)
        c.drawCircle(1200f,900f,500f,p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 5f
        p.color = Color.BLACK
        c.drawCircle(1200f,900f,500f,p)

        //ARBOLES
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawRect(320f,350f,380f,430f,p)
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawCircle(350f,220f,70f,p)
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawCircle(350f,300f,70f,p)

        //ARBOL 2
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawRect(1000f,940f,1000f,500f,p)
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawCircle(970f,300f,70f,p)
        p.style = Paint.Style.FILL
        p.color = Color.BLACK
        c.drawCircle(970f,380f,70f,p)

        c.drawBitmap(tumba1,posX,280f,p)
        c.drawBitmap(tumba2,posX2,350f,p)
        c.drawBitmap(tumba3,posX3,350f,p)
        c.drawBitmap(tumba4,posX4,280f,p)
        c.drawBitmap(mano,posX6,390f,p)
        c.drawBitmap(mano2,posX7,390f,p)
        c.drawBitmap(mano3,posX8,450f,p)
        c.drawBitmap(catrina,posX5,200f,p)
        c.drawBitmap(cuervo,posX9,20f,p)

    }//onDraw
}
