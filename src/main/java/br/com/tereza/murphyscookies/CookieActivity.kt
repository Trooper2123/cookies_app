package br.com.tereza.murphyscookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TextView.AUTO_SIZE_TEXT_TYPE_NONE
import android.widget.TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM
import androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults
import kotlinx.android.synthetic.main.activity_cookie.*

class CookieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cookie)
        supportActionBar?.hide()
        setAutoSizeTextTypeWithDefaults(cookieString,AUTO_SIZE_TEXT_TYPE_UNIFORM)


        var cookieTextView:TextView = findViewById(R.id.cookieString)

        val cookies = arrayListOf(
            "As variáveis variam menos que as constantes.",
            "Se você joga fora alguma coisa que tem há muito tempo, vai precisar dela logo, logo.",
            "Toda a idéia revolucionária provoca três estágios: 1º. ‘é impossível – não perca meu tempo.’ 2º. ‘é possível, mas não vale o esforço’ 3º. ‘eu sempre disse que era uma boa idéia’",
            "Não é possível alcançar o total exato de qualquer soma com mais de dez parcelas depois das cinco horas da tarde de sexta feira. O total exato será encontrado facilmente as 9:01 da manhã de segunda feira.",
            "Qualquer upgrade custa mais e leva mais tempo para aprender.",
            "As coisas podem piorar, você é que não tem imaginação.",
            "Cada professor parte do pressuposto de que você não tem mais o que fazer, senão estudar a matéria dele.",
            " Qualquer coisa entre parênteses pode ser ignorada (com vantagem, como vê neste exemplo perfeitamente inútil).",
            "Em qualquer fórmula, as constantes (especialmente as registradas nos manuais de engenharia) deverão ser consideradas variáveis.",
            "Se você é capaz de distinguir entre o bom e o mal conselho, você não precisa de conselho.",
            "O material é danificado na proporção direta do seu valor.",
            "Nunca há horas suficientes em um dia, mas sempre há muitos dias antes do sábado.",
            "Não vai funcionar.",
            " Nada é impossível para quem não tem que fazer o trabalho.",
            "Não adianta amarrar o pão com manteiga nas costas do gato e o jogar no carpete. Provavelmente o gato comerá o pão antes de cair em pé.",
            " Nada é tão bom que alguém, em algum lugar, não irá odiar.",
            " Por mais tomadas que se tenham em casa, os móveis estão sempre na frente.",
            "Toda partícula que voa sempre encontra um olho.",
            " Quando um trabalho é mal feito, qualquer tentativa de melhorá-lo piora.",
            " Adiar é a forma mais perfeita de negar.",
            " As coisa vão piorar antes de melhorar. E quem disse que as coisas vão melhorar?",
            " Nunca avise que a declaração que vai fazer é importante.",
            " Se você for esperar o motivo certo para fazer alguma coisa, nunca fará nada.",
            "É sempre morro acima e contra o vento.",
            " Ninguém nunca está ouvindo, até você cometer um erro.",
            " Se está escrito “Tamanho único”, é porque não serve em ninguém.",
            " Nada é tão fácil quanto parece, nada está tão ruim que não possa piorar.",
            " Por que será que números errados nunca estão ocupados?",
            "A maioria dos trabalhos manuais exigem três mãos para serem executados.",
            " Tudo que é bom na vida é ilegal, imoral ou engorda."


        )

        giveCookieButton.setOnClickListener {
            val n : Int = cookies.lastIndex
            val randomNumber = (0..n).random()

            cookieTextView.text = cookies[randomNumber].toString()

        }

        noMoreButton.setOnClickListener {
            val mIntent = Intent(this, SplashActivity::class.java)
            startActivity(mIntent)
        }
    }
}