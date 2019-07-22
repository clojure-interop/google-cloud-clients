(ns com.google.cloud.dns.DnsOptions$DefaultDnsFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns DnsOptions$DefaultDnsFactory]))

(defn ->default-dns-factory
  "Constructor."
  (^DnsOptions$DefaultDnsFactory []
    (new DnsOptions$DefaultDnsFactory )))

(defn create
  "options - `com.google.cloud.dns.DnsOptions`

  returns: `com.google.cloud.dns.Dns`"
  (^com.google.cloud.dns.Dns [^DnsOptions$DefaultDnsFactory this ^com.google.cloud.dns.DnsOptions options]
    (-> this (.create options))))

