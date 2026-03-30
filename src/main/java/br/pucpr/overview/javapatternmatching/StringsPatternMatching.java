package br.pucpr.overview.javapatternmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsPatternMatching {

    public int countEmptyString(String text) {
        Pattern pattern = Pattern.compile("\s");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;

        while (matcher.find()) {
            String group = matcher.group();
            counter++;
        }
        return counter;
    }

    public int countWordWithoutEmptyString(String text) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;

        while (matcher.find()) {
            String group = matcher.group();
            counter++;
        }
        return counter;
    }

    public void analize() {

        String text = "Inovação    no mercado de trabalho é algo que nos motiva a ampliar e \n" +
                "diversificar estilos de carreiras, para criar novas maneiras de se sustentar na vida. Muitas pessoas expecialmente em gerações modernas estão conseguindo evoluir monetariamente por capitalisar de suas abilidades unicas, personalizando seu estilo de trebalhar fazendo as destacar no meio de um grupo normalmente visto como descartaveis. A comprienção desse evento tem que ser discutida para a auxilio de futuras gerações. Um inicio de uma nessecidade a esse movimento pode ser encontrado na inflação de bens obrigatorios, como casa, luz e até água está sendo mais difíceis de ter, incluido com a diminuição dos salarios, trabalhos de baixo cargo empresarial ou professores até pedreiros estão cada vez mais complicado de alcançar conforto monetario. Em um metodo de adaptar no sistema muitos acabaram dscobrindo um jeito de monetizar suas abilidades e hobbies, podendo ampliando sua eficiencia no trabalho atual ou como um segundo meio de renda que facilita o pagamento de suas necessidades. Mesmo com pessoas inovando ainda à casos de pessoas não se adaptando, isso acontece primariamente pelo sistema de educação desatualizado, em muitas escolas e univercidades com pensamentos primitivos dos metodos de trabalhos, somos ensinados para ser uma simples engrenagem fazendo o que somos ordenados. Ações assim foram retratadas no filme Tempos modernos de Charly Chaplin onde mostra uma fabrica da primeira revolução industrial. Recentemente estão percebendo a valorização da criatividade individual que contradiz o que somos ensinado, o primeiro passo a melhorar e podando essa idea. Em conclusão, o mundo profissionla contemporaneo se caracteriza por uma diverssidade de possibilidades quem amplia horizontes e tranforma a forma de rlacionarmos com o trabalho. As novas tecnologias, globalização e valorização de habilidades interpessoais e criatividade proporcionam oportunidades sem precedentes, mas exigem adaptação e constante aprendizadeo para que o individuo evolua junto com o mercado. Nesse senario é necessario que busquem novas formações técnicas, também desenvolvam competência emocional e capacidade de se reinventar. Assim, estar aberto, às novas experiencias e desafios para prosperar em um mercado de trabalho cada vez mais multifacetado e competitivo.";

        System.out.println("Numero de espaços em branco " + countEmptyString(text));

        String text2 = "Inovação    no m1241451414141 de trabalho é algo que nos motiva a ampliar e \n" +
                "diversificar estilos de carreiras, para criar novas maneiras de se sustentar na vida. Muitas pessoas expecialmente em gerações modernas estão conseguindo evoluir monetariamente por capitalisar de suas abilidades unicas, personalizando seu estilo de trebalhar fazendo as destacar no meio de um grupo normalmente visto como descartaveis. A comprienção desse evento tem que ser discutida para a auxilio de futuras gerações. Um inicio de uma nessecidade a esse movimento pode ser encontrado na inflação de bens obrigatorios, como casa, luz e até água está sendo mais difíceis de ter, incluido com a diminuição dos salarios, trabalhos de baixo cargo empresarial ou professores até pedreiros estão cada vez mais complicado de alcançar conforto monetario. Em um metodo de adaptar no sistema muitos acabaram dscobrindo um jeito de monetizar suas abilidades e hobbies, podendo ampliando sua eficiencia no trabalho atual ou como um segundo meio de renda que facilita o pagamento de suas necessidades. Mesmo com pessoas inovando ainda à casos de pessoas não se adaptando, isso acontece primariamente pelo sistema de educação desatualizado, em muitas escolas e univercidades com pensamentos primitivos dos metodos de trabalhos, somos ensinados para ser uma simples engrenagem fazendo o que somos ordenados. Ações assim foram retratadas no filme Tempos modernos de Charly Chaplin onde mostra uma fabrica da primeira revolução industrial. Recentemente estão percebendo a valorização da criatividade individual que contradiz o que somos ensinado, o primeiro passo a melhorar e podando essa idea. Em conclusão, o mundo profissionla contemporaneo se caracteriza por uma diverssidade de possibilidades quem amplia horizontes e tranforma a forma de rlacionarmos com o trabalho. As novas tecnologias, globalização e valorização de habilidades interpessoais e criatividade proporcionam oportunidades sem precedentes, mas exigem adaptação e constante aprendizadeo para que o individuo evolua junto com o mercado. Nesse senario é necessario que busquem novas formações técnicas, também desenvolvam competência emocional e capacidade de se reinventar. Assim, estar aberto, às novas experiencias e desafios para prosperar em um mercado de trabalho cada vez mais multifacetado e competitivo.";

        System.out.println("Numero de PALAVRAS " + countWordWithoutEmptyString(text));
        System.out.println("Numero de PALAVRAS " + countWordWithoutEmptyString(text2));

    }
}
