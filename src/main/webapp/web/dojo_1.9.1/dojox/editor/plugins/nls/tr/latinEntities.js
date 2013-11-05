define(
({
	/* These are already handled in the default RTE
	amp:"ampersand",lt:"less-than sign",
	gt:"greater-than sign",
	nbsp:"no-break space\nnon-breaking space",
	quot:"quote",
	*/
	iexcl:"ters ünlem işareti",
	cent:"sent işareti",
	pound:"sterlin işareti",
	curren:"döviz işareti",
	yen:"yen işareti\nyuan işareti",
	brvbar:"kesik çubuk\nkesik çubuk",
	sect:"bölüm işareti",
	uml:"umlaut işareti\naralıklı umlaut işareti",
	copy:"telif hakkı işareti",
	ordf:"dişi sıra göstergesi",
	laquo:"sol açılı çift tırnak işareti\nleft pointing guillemet",
	not:"değil işareti",
	shy:"koşullu kesme işareti\nisteğe bağlı kesme işareti",
	reg:"tescil işareti\ntescilli ticari marka işareti",
	macr:"uzatma işareti\naralıklı uzatma işareti\nüst çizgi\nAPL üstçizgisi",
	deg:"derece işareti",
	plusmn:"artı-eksi işareti\nartı-veya-eksi işareti",
	sup2:"üst simge iki\nüst simge iki rakamı\nkare işareti",
	sup3:"üst simge üç\nüst simge üç rakamı\nküp işareti",
	acute:"tiz aksan işareti\naralıklı aksan",
	micro:"mikro işareti",
	para:"pilcrow işareti\nparagraf işareti",
	middot:"orta nokta\nGeorgian comma\nGreek middle dot",
	cedil:"çengel\naralıklı çengel",
	sup1:"üst simge bir\nüst simge bir rakamı",
	ordm:"erkek sıra göstergesi",
	raquo:"sağ açılı çift tırnak işareti\nright pointing guillemet",
	frac14:"dörtte birlik bayağı kesir\ndörtte birlik kesir",
	frac12:"bir bölü ikilik bayağı kesir\nbir bölü ikilik kesir",
	frac34:"dörtte üçlük bayağı kesir\ndörtte üçlük kesir",
	iquest:"ters soru işareti\ndönmüş soru işareti",
	Agrave:"Aksan imiyle Latince büyük harf A\nLatince büyük harf A aksanlı",
	Aacute:"Vurgu imiyle Latince büyük harf A",
	Acirc:"İnceltme imiyle Latince büyük harf A",
	Atilde:"Tilde imiyle Latince büyük harf A",
	Auml:"Umlaut imiyle Latince büyük harf A",
	Aring:"Üstte halka imiyle Latince büyük harf A\nLatince büyük harf A halkalı",
	AElig:"Latince büyük harf AE\nLatince büyük birleştirmeli yazım AE",
	Ccedil:"Çengel imiyle Latince büyük harf C",
	Egrave:"Aksan imiyle Latince büyük harf E",
	Eacute:"Vurgu imiyle Latince büyük harf E",
	Ecirc:"İnceltme imiyle Latince büyük harf E",
	Euml:"Umlaut imiyle Latince büyük harf E",
	Igrave:"Aksan imiyle Latince büyük harf I",
	Iacute:"Vurgu imiyle Latince büyük harf I",
	Icirc:"İnceltme imiyle Latince büyük harf I",
	Iuml:"Umlaut imiyle Latince büyük harf I",
	ETH:"Latince büyük harf ETH",
	Ntilde:"Tilde imiyle Latince büyük harf N",
	Ograve:"Aksan imiyle Latince büyük harf O",
	Oacute:"Vurgu imiyle Latince büyük harf O",
	Ocirc:"İnceltme imiyle Latince büyük harf O",
	Otilde:"Tilde imiyle Latince büyük harf O",
	Ouml:"Umlaut imiyle Latince büyük harf O",
	times:"çarpma işareti",
	Oslash:"Bölü işaretiyle Latince büyük harf O\ntaksim işaretiyle Latince büyük harf O",
	Ugrave:"Aksan imiyle Latince büyük harf U",
	Uacute:"Vurgu imiyle Latince büyük harf U",
	Ucirc:"İnceltme imiyle Latince büyük harf U",
	Uuml:"Umlaut işaretiyle Latince büyük harf U",
	Yacute:"Vurgu imiyle Latince büyük harf Y",
	THORN:"Latince büyük harf THORN",
	szlig:"Latince küçük harf sert s\ness-zed",
	agrave:"Aksan imiyle Latince küçük harf a\nLatince küçük harf a aksanlı",
	aacute:"Vurgu imiyle Latince küçük harf a",
	acirc:"İnceltme imiyle Latince küçük harf a",
	atilde:"Tilde imiyle Latince küçük harf a",
	auml:"Umlaut imiyle Latince küçük harf a",
	aring:"Üstte halka imiyle Latince küçük harf a\nLatince küçük harf a halkalı",
	aelig:"Latince küçük harf ae\nLatince küçük birleştirmeli yazım ae",
	ccedil:"Çengel imiyle Latince küçük harf c",
	egrave:"Aksan imiyle Latince küçük harf e",
	eacute:"Vurgu imiyle Latince küçük harf e",
	ecirc:"İnceltme imiyle Latince küçük harf e",
	euml:"Umlaut imiyle Latince küçük harf e",
	igrave:"Aksan imiyle Latince küçük harf i",
	iacute:"Vurgu imiyle Latince küçük harf i",
	icirc:"İnceltme imiyle Latince küçük harf i",
	iuml:"Umlaut imiyle Latince küçük harf i",
	eth:"Latince küçük harf eth",
	ntilde:"Tilde imiyle Latince küçük harf n",
	ograve:"Aksan imiyle Latince küçük harf o",
	oacute:"Vurgu imiyle Latince küçük harf o",
	ocirc:"İnceltme imiyle Latince küçük harf o",
	otilde:"Tilde imiyle Latince küçük harf o",
	ouml:"Umlaut imiyle Latince küçük harf o",
	divide:"bölü işareti",
	oslash:"Bölü işaretiyle Latince küçük harf o\ntaksim işaretiyle Latince küçük harf o",
	ugrave:"Aksan imiyle Latice küçük harf u",
	uacute:"Vurgu imiyle Latince küçük harf u",
	ucirc:"İnceltme imiyle Latince küçük harf u",
	uuml:"Umlaut imiyle Latince küçük harf u",
	yacute:"Vurgu imiyle Latince küçük harf y",
	thorn:"Latince küçük harf thorn",
	yuml:"Umlaut imiyle Latince küçük harf y",
// Greek Characters and Symbols
	fnof:"Kanca imiyle Latince küçük f\nfonksiyon\nflorin",
	Alpha:"Yunanca büyük harf alpha",
	Beta:"Yunanca büyük harf beta",
	Gamma:"Yunanca büyük harf gamma",
	Delta:"Yunanca büyük harf delta",
	Epsilon:"Yunanca büyük harf epsilon",
	Zeta:"Yunanca büyük harf zeta",
	Eta:"Yunanca büyük harf eta",
	Theta:"Yunanca büyük harf theta",
	Iota:"Yunanca büyük harf iota",
	Kappa:"Yunanca büyük harf kappa",
	Lambda:"Yunanca büyük harf lambda",
	Mu:"Yunanca büyük harf mu",
	Nu:"Yunanca büyük harf nu",
	Xi:"Yunanca büyük harf xi",
	Omicron:"Yunanca büyük harf omicron",
	Pi:"Yunanca büyük harf pi",
	Rho:"Yunanca büyük harf rho",
	Sigma:"Yunanca büyük harf sigma",
	Tau:"Yunanca büyük harf tau",
	Upsilon:"Yunanca büyük harf upsilon",
	Phi:"Yunanca büyük harf phi",
	Chi:"Yunanca büyük harf chi",
	Psi:"Yunanca büyük harf psi",
	Omega:"Yunanca büyük harf omega",
	alpha:"Yunanca küçük harf alpha",
	beta:"Yunanca küçük harf beta",
	gamma:"Yunanca küçük harf gamma",
	delta:"Yunanca küçük harf delta",
	epsilon:"Yunanca küçük harf epsilon",
	zeta:"Yunanca küçük harf zeta",
	eta:"Yunanca küçük harf eta",
	theta:"Yunanca küçük harf theta",
	iota:"Yunanca küçük harf iota",
	kappa:"Yunanca küçük harf kappa",
	lambda:"Yunanca küçük harf lambda",
	mu:"Yunanca küçük harf mu",
	nu:"Yunanca küçük harf nu",
	xi:"Yunanca küçük harf xi",
	omicron:"Yunanca küçük harf omicron",
	pi:"Yunanca küçük harf pi",
	rho:"Yunanca küçük harf rho",
	sigmaf:"Yunanca küçük harf final",
	sigma:"Yunanca küçük harf final",
	tau:"Yunanca küçük harf tau",
	upsilon:"Yunanca küçük harf final",
	phi:"Yunanca küçük harf phi",
	chi:"Yunanca küçük harf final",
	psi:"Yunanca küçük harf psi",
	omega:"Yunanca küçük harf final",
	thetasym:"Yunanca küçük harf theta",
	upsih:"Kanca işaretiyle Yunanca upsilon",
	piv:"Yunanca pi işareti",
	bull:"madde imi\nsiyah küçük daire",
	hellip:"yanyana üç nokta\nüç nokta",
	prime:"üssü\ndakika\nfit",
	Prime:"üssü iki\nsaniye\ninç",
	oline:"üstçizgi\naralıklı üstçizgi",
	frasl:"bölme işaretli kesir",
	weierp:"el yazısı büyük P\nkuvvet kümesi\nWeierstrass p",
	image:"Gotik büyük harf I\nsanal kısım",
	real:"Gotik büyük harf R\ngerçek kısım işareti",
	trade:"ticari marka işareti",
	alefsym:"alef simgesi\nbirinci sonlu sayma sayısı",
	larr:"sol ok işareti",
	uarr:"yukarı ok işareti",
	rarr:"sağ ol işareti",
	darr:"aşağı ok işareti",
	harr:"sol sağ ok",
	crarr:"sola dönen aşağı ok\nsatır başı karakteri",
	lArr:"sola çift ok",
	uArr:"yukarı çift ok",
	rArr:"sağa çift ok",
	dArr:"aşağı çift ok",
	hArr:"sola sağa çift ok",
	forall:"for all",
	part:"kısmi türev",
	exist:"vardır",
	empty:"boş küme\nboş küme\nçap",
	nabla:"nabla\ngeriye doğru fark",
	isin:"elemanıdır",
	notin:"elemanı değildir",
	ni:"kapsar",
	prod:"n-ary çarpım\nçarpım işareti",
	sum:"n-ary toplamı",
	minus:"eksi işareti",
	lowast:"asterisk işleci",
	radic:"kare kök\nkök işareti",
	prop:"orantılı",
	infin:"sonsuzluk",
	ang:"açı",
	and:"matıksal ve\nwedge",
	or:"mantıksal veya\nvee",
	cap:"kesişim\ncap",
	cup:"bileşim\ncup","int":"integral",
	there4:"bu nedenle",
	sim:"tilde işleci\nile çeşitlenen\nile benzer",
	cong:"yaklaşık olarak eşit",
	asymp:"neredeyse eşit\nkavuşmaz",
	ne:"eşit değil",
	equiv:"aynı",
	le:"daha küçük ya da eşit",
	ge:"daha büyük ya da eşit",
	sub:"alt kümesi",
	sup:"üst kümesi",
	nsub:"alt kümesi değil",
	sube:"alt kümesi ya da eşit",
	supe:"üst kümesi ya da eşit",
	oplus:"daire içinde artı\ndolaysız toplam",
	otimes:"daire içinde çarpı\nvektörel çarpım",
	perp:"up tack\ndik\ndikey",
	sdot:"nokta işleci",
	lceil:"left ceiling\nAPL upstile",
	rceil:"right ceiling",
	lfloor:"left floor\nAPL downstile",
	rfloor:"right floor",
	lang:"sol açılı ayraç",
	rang:"sağ açılı ayraç",
	loz:"baklava biçimi",
	spades:"siyah maça işareti",
	clubs:"siyah sinek işareti\nyonca",
	hearts:"siyah kupa işareti\nkalp",
	diams:"siyah karo işareti",
	OElig:"Latince büyük birleşik harf OE",
	oelig:"Latince küçük birleşik harf oe",
	Scaron:"Karon imiyle Latince büyük harf S",
	scaron:"Karon imiyle Latince küçük harf s",
	Yuml:"Umlaut imiyle Latince büyük harf Y",
	circ:"niteleyici harf inceltme vurgusu",
	tilde:"küçük tilde",
	ensp:"kısa boşluk",
	emsp:"uzun boşluk",
	thinsp:"ince boşluk",
	zwnj:"sıfır genişlik ayırıcı",
	zwj:"sıfır genişlik birleştirici",
	lrm:"soldan sağa işareti",
	rlm:"sağdan sola işareti",
	ndash:"tire",
	mdash:"uzun tire",
	lsquo:"sol tek tırnak işareti",
	rsquo:"sağ tek tırnak işareti",
	sbquo:"9 biçimli alçak tek tırnak işareti",
	ldquo:"sol çift tırnak işareti",
	rdquo:"sağ çift tırnak işareti",
	bdquo:"9 biçimli alçak çift tırnak işareti",
	dagger:"kama",
	Dagger:"çift kama",
	permil:"binde işareti",
	lsaquo:"sol açılı tek tırnak işareti",
	rsaquo:"sağ açılı tek tırnak işareti",
	euro:"euro işareti"
})
);
