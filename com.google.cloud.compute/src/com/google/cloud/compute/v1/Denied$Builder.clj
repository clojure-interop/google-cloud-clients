(ns com.google.cloud.compute.v1.Denied$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Denied$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Denied`

  returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^Denied$Builder this ^com.google.cloud.compute.v1.Denied other]
    (-> this (.mergeFrom other))))

(defn get-ip-protocol
  "The IP protocol to which this rule applies. The protocol type is required when creating a
   firewall rule. This value can either be one of the following well known protocol strings
   (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.

  returns: `java.lang.String`"
  (^java.lang.String [^Denied$Builder this]
    (-> this (.getIPProtocol))))

(defn set-ip-protocol
  "The IP protocol to which this rule applies. The protocol type is required when creating a
   firewall rule. This value can either be one of the following well known protocol strings
   (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.

  i-p-protocol - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^Denied$Builder this ^java.lang.String i-p-protocol]
    (-> this (.setIPProtocol i-p-protocol))))

(defn get-ports-list
  "An optional list of ports to which this rule applies. This field is only applicable for UDP
   or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   applies to connections through any port.

   Example inputs include: [\"22\"], [\"80\",\"443\"], and [\"12345-12349\"].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Denied$Builder this]
    (-> this (.getPortsList))))

(defn add-all-ports
  "An optional list of ports to which this rule applies. This field is only applicable for UDP
   or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   applies to connections through any port.

   Example inputs include: [\"22\"], [\"80\",\"443\"], and [\"12345-12349\"].

  ports - `java.util.List`

  returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^Denied$Builder this ^java.util.List ports]
    (-> this (.addAllPorts ports))))

(defn add-ports
  "An optional list of ports to which this rule applies. This field is only applicable for UDP
   or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   applies to connections through any port.

   Example inputs include: [\"22\"], [\"80\",\"443\"], and [\"12345-12349\"].

  ports - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^Denied$Builder this ^java.lang.String ports]
    (-> this (.addPorts ports))))

(defn build
  "returns: `com.google.cloud.compute.v1.Denied`"
  (^com.google.cloud.compute.v1.Denied [^Denied$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^Denied$Builder this]
    (-> this (.clone))))

