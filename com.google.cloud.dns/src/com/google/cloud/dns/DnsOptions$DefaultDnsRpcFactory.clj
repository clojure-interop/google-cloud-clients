(ns com.google.cloud.dns.DnsOptions$DefaultDnsRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns DnsOptions$DefaultDnsRpcFactory]))

(defn ->default-dns-rpc-factory
  "Constructor."
  (^DnsOptions$DefaultDnsRpcFactory []
    (new DnsOptions$DefaultDnsRpcFactory )))

(defn create
  "options - `com.google.cloud.dns.DnsOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^DnsOptions$DefaultDnsRpcFactory this ^com.google.cloud.dns.DnsOptions options]
    (-> this (.create options))))

