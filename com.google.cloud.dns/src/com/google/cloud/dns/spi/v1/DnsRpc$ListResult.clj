(ns com.google.cloud.dns.spi.v1.DnsRpc$ListResult
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns.spi.v1 DnsRpc$ListResult]))

(defn ->list-result
  "Constructor.

  page-token - `java.lang.String`
  results - `java.lang.Iterable`"
  (^DnsRpc$ListResult [^java.lang.String page-token ^java.lang.Iterable results]
    (new DnsRpc$ListResult page-token results)))

(defn *of
  "page-token - `java.lang.String`
  list - `java.lang.Iterable`

  returns: `<T> com.google.cloud.dns.spi.v1.DnsRpc$ListResult<T>`"
  ([^java.lang.String page-token ^java.lang.Iterable list]
    (DnsRpc$ListResult/of page-token list)))

(defn results
  "returns: `java.lang.Iterable<T>`"
  (^java.lang.Iterable [^DnsRpc$ListResult this]
    (-> this (.results))))

(defn page-token
  "returns: `java.lang.String`"
  (^java.lang.String [^DnsRpc$ListResult this]
    (-> this (.pageToken))))

