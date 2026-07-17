# cloud-itonami-assoc-9411-swe-sn

Industry rule/history catalog for **Svenskt Näringsliv** (Confederation
of Swedish Enterprise) — the EIGHTEENTH entry aligned to **ISIC 9411**
(activities of business, employers, and professional membership
organizations), alongside
[`-9411-sau-fsc`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-sau-fsc)
(Saudi Arabia),
[`-9411-aut-wko`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-aut-wko)
(Austria),
[`-9411-irl-ibec`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-irl-ibec)
(Ireland),
[`-9411-nzl-businessnz`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nzl-businessnz)
(New Zealand),
[`-9411-cze-spcr`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-cze-spcr)
(Czech Republic),
[`-9411-ind-cii`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ind-cii)
(India),
[`-9411-zaf-busa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-zaf-busa)
(South Africa),
[`-9411-bra-cni`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bra-cni)
(Brazil),
[`-9411-ken-kam`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ken-kam)
(Kenya),
[`-9411-can-chamber`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-can-chamber)
(Canada),
[`-9411-mex-coparmex`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-mex-coparmex)
(Mexico),
[`-9411-ita-confindustria`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ita-confindustria)
(Italy),
[`-9411-nld-vnoncw`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nld-vnoncw)
(Netherlands),
[`-9411-kor-kcci`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-kor-kcci)
(South Korea),
[`-9411-arg-uia`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-arg-uia)
(Argentina),
[`-9411-bel-feb`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bel-feb)
(Belgium), and
[`-9411-dnk-di`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-dnk-di)
(Denmark). Part of the
[`cloud-itonami`](https://github.com/cloud-itonami) compliance-fact
family (ADR-2607141700, `cloud-itonami-compliance-fact-federation`,
in `com-junkawasaki/root`).

## Sourcing note

This repo fills Sweden's previously-open association-axis gap (one of
the 10-country gap list recorded at tick 152). Sweden now has real,
individually verified facts across all three axes: country
([`cloud-itonami-iso3166-swe`](https://github.com/cloud-itonami/cloud-itonami-iso3166-swe)),
municipality
([`cloud-itonami-municipality-swe-gothenburg`](https://github.com/cloud-itonami/cloud-itonami-municipality-swe-gothenburg)),
and association (this repo).

`svensktnaringsliv.se`'s own domain did not surface founding-history
detail on the pages checked this tick. Both entries here were
instead directly WebFetch-verified against `sv.wikipedia.org`'s own
article (more precise than the English-language summary),
independently corroborated by `en.wikipedia.org` and Wikidata
(Q1474680)'s own "inception" statement.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on Svenskt
Näringsliv's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

Both entries directly WebFetch-verified against `sv.wikipedia.org`'s
own article: the 1902 founding of Svenska Arbetsgivareföreningen
(SAF, one of two direct predecessors), and the March 2001 formation
of Svenskt Näringsliv via merger of SAF and Sveriges Industriförbund
(founded 1910).

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains Svenskt Näringsliv's; this repo stores only citation
metadata (id/title/url/dates), not full text.
