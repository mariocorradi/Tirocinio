parser grammar SpanishParser;
options { tokenVocab=SpanishLexer;}
import GeneraleParser;
page	:	sezione+;
sezione	:	EnterSezione ( nomeSezioneGenerale | nomeSezioneParticolare ) ExitSezione contenuto;
nomeSezioneParticolare	:	SezioneSpecifica ;
nomeSezioneGenerale	:	TestoNomeSezione ;
