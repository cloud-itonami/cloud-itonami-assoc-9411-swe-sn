(ns association.facts
  "Industry rule/history catalog for Svenskt Näringsliv (Confederation
  of Swedish Enterprise) -- a 60th industry-association-level source
  (see cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko, -9411-irl-ibec,
  -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii, -9411-zaf-busa,
  -9411-bra-cni, -9411-ken-kam, -9411-can-chamber, -9411-mex-coparmex,
  -9411-ita-confindustria, -9411-nld-vnoncw, -9411-kor-kcci,
  -9411-arg-uia, -9411-bel-feb, -9411-dnk-di for the first seventeen)
  per ADR-2607141700 (cloud-itonami-compliance-fact-federation). The
  EIGHTEENTH entry aligned to ISIC 9411 (activities of business,
  employers, and professional membership organizations). Fills
  Sweden's previously-open association-axis gap (one of the
  10-country gap list recorded at tick 152) -- Sweden now has real,
  individually verified facts across ALL THREE axes (country:
  cloud-itonami-iso3166-swe statute.facts; municipality:
  cloud-itonami-municipality-swe-gothenburg; association: this
  entry).

  svensktnaringsliv.se's own domain did not surface founding-history
  detail on the pages checked this tick. Both entries here were
  instead directly WebFetch-verified against sv.wikipedia.org's own
  article, which quotes verbatim: 'Organisationen bildades i mars
  2001 genom en sammanslagning av Sveriges Industriförbund och
  Svenska Arbetsgivareföreningen, i sin tur bildade 1910 respektive
  1902' (the organisation was formed in March 2001 through a merger
  of Sveriges Industriförbund and Svenska Arbetsgivareföreningen,
  which were founded in 1910 and 1902 respectively). The 2001 date is
  independently corroborated by en.wikipedia.org's own article
  ('completed in March 2001') and by Wikidata Q1474680's own
  'inception' statement. No personal names of office-holders are
  persisted here.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"sn"
   [{:association-rule/id "sn.predecessor-saf-1902"
     :association-rule/title "Svenska Arbetsgivareföreningen (SAF), one of Svenskt Näringsliv's two direct predecessors, founded 1902 (sv.wikipedia.org)"
     :association-rule/association "sn"
     :association-rule/isic "9411"
     :association-rule/country "SWE"
     :association-rule/kind :governance-program
     :association-rule/url "https://sv.wikipedia.org/wiki/Svenskt_N%C3%A4ringsliv"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/established-date "1902"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}
    {:association-rule/id "sn.founding-2001-03-merger"
     :association-rule/title "Svenskt Näringsliv formed in March 2001 via merger of Svenska Arbetsgivareföreningen (SAF) and Sveriges Industriförbund (founded 1910) (sv.wikipedia.org, corroborated by en.wikipedia.org and Wikidata Q1474680 inception statement)"
     :association-rule/association "sn"
     :association-rule/isic "9411"
     :association-rule/country "SWE"
     :association-rule/kind :governance-program
     :association-rule/url "https://sv.wikipedia.org/wiki/Svenskt_N%C3%A4ringsliv"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/established-date "2001-03"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-swe-sn Wave 0 (ADR-2607141700): "
                 (count (get catalog "sn")) " Svenskt Näringsliv entries seeded "
                 "with sv.wikipedia.org + en.wikipedia.org + Wikidata Q1474680 corroboration "
                 "(svensktnaringsliv.se's own pages lack founding-history text). "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
