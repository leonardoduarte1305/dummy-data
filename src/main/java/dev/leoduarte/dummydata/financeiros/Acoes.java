package dev.leoduarte.dummydata.financeiros;

import java.util.*;

import static dev.leoduarte.dummydata.util.RandomicoUtil.getRandomico;

public class Acoes {

    private static Map<String, String> empresas = populandoLista();

    private static Map<String, String> populandoLista() {
        empresas = new HashMap<>();
        empresas.put("PETR4", "Petroleo Brasileiro S.A. - Petrobras");
        empresas.put("VALE3", "Vale S.A.");
        empresas.put("ITUB4", "Itau Unibanco Holding S.A.");
        empresas.put("BBDC4", "Banco Bradesco S.A.");
        empresas.put("ABEV3", "Ambev S.A.");
        empresas.put("B3SA3", "B3 S.A. - Brasil, Bolsa, Balcão");
        empresas.put("JBSS3", "JBS S.A.");
        empresas.put("CMIG4", "Cemig - Companhia Energetica de Minas Gerais");
        empresas.put("PETR3", "Petroleo Brasileiro S.A. - Petrobras");
        empresas.put("MGLU3", "Magazine Luiza S.A.");
        empresas.put("AZUL4", "Azul S.A.");
        empresas.put("GGBR4", "Gerdau S.A.");
        empresas.put("ITSA4", "Itausa - Investimentos Itau S.A.");
        empresas.put("VVAR3", "Via Varejo S.A.");
        empresas.put("SUZB3", "Suzano S.A.");
        empresas.put("RADL3", "Randon S.A. Implementos e Participacoes");
        empresas.put("TIMS3", "Telefonica Brasil S.A.");
        empresas.put("IRBR3", "IRB Brasil Resseguros S.A.");
        empresas.put("RENT3", "Localiza Rent a Car S.A.");
        empresas.put("EGIE3", "Engie Brasil Energia S.A.");
        empresas.put("LREN3", "Lojas Renner S.A.");
        empresas.put("SBSP3", "Sabesp - Companhia de Saneamento Basico do Estado de Sao Paulo");
        empresas.put("BBSE3", "BB Seguridade Participacoes S.A.");
        empresas.put("CIEL3", "Cielo S.A.");
        empresas.put("CVCB3", "CVC Brasil Operadora e Agencia de Viagens S.A.");
        empresas.put("CSAN3", "Cosan S.A.");
        empresas.put("ELET3", "Centrais Eletricas Brasileiras S.A. - Eletrobras");
        empresas.put("ELET6", "Centrais Eletricas Brasileiras S.A. - Eletrobras");
        empresas.put("EMBR3", "Embraer S.A.");
        empresas.put("ENBR3", "EDP - Energias do Brasil S.A.");
        empresas.put("FLRY3", "Fleury S.A.");
        empresas.put("GOLL4", "Gol Linhas Aereas Inteligentes S.A.");
        empresas.put("HAPV3", "Hapvida Participacoes e Investimentos S.A.");
        empresas.put("IGTA3", "Iguatemi Empresa de Shopping Centers S.A.");
        empresas.put("MRFG3", "Marfrig Global Foods S.A.");
        empresas.put("MRVE3", "MRV Engenharia e Participacoes S.A.");
        empresas.put("PCAR3", "Companhia Brasileira de Distribuicao");
        empresas.put("QUAL3", "Qualicorp Consultoria e Corretora de Seguros S.A.");
        empresas.put("SBFG3", "Santander Brasil Financiamentos S.A.");
        empresas.put("SMLS3", "Smiles Fidelidade S.A.");
        empresas.put("SULA11", "Sul America S.A.");
        empresas.put("TAEE11", "Taesa - Transmissora Alianca de Energia Eletrica S.A.");
        empresas.put("TOTS3", "Totvs S.A.");
        empresas.put("UGPA3", "Ultrapar Participacoes S.A.");
        empresas.put("USIM5", "Usinas Siderurgicas de Minas Gerais S.A. - Usiminas");
        empresas.put("WEGE3", "WEG S.A.");
        empresas.put("YDUQ3", "Yduqs Participacoes S.A.");
        empresas.put("GNDI3", "Notredame Intermédica Participacoes S.A.");
        empresas.put("LCAM3", "Locamerica S.A.");
        empresas.put("HYPE3", "Hypera S.A.");
        return empresas;
    }

    public static String getSiglaRandomica() {
        var siglas = Collections.singletonList(getListaDeSiglas().get(getRandomico(empresas.size())));
        return siglas.get(getRandomico(siglas.size()));
    }

    public static List<String> getListaDeSiglas() {
        return new ArrayList<>(empresas.keySet());
    }

    public static String getNomeCompleto(String sigla) {
        return empresas.get(sigla);
    }

    public static List<String> getListaDeEmpresas() {
        return empresas.values().stream().toList();
    }


}
