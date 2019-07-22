(ns com.google.cloud.dns.DnsOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns DnsOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.dns.DnsOptions$Builder`"
  (^com.google.cloud.dns.DnsOptions$Builder [^DnsOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn build
  "returns: `com.google.cloud.dns.DnsOptions`"
  (^com.google.cloud.dns.DnsOptions [^DnsOptions$Builder this]
    (-> this (.build))))

