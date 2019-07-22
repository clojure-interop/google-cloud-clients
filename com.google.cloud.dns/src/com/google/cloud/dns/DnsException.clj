(ns com.google.cloud.dns.DnsException
  "DNS service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns DnsException]))

(defn ->dns-exception
  "Constructor.

  code - `int`
  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^DnsException [^Integer code ^java.lang.String message ^java.lang.Throwable cause]
    (new DnsException code message cause))
  (^DnsException [^java.io.IOException exception ^Boolean idempotent]
    (new DnsException exception idempotent)))

