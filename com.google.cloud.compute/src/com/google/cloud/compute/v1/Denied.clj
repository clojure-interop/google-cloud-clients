(ns com.google.cloud.compute.v1.Denied
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Denied]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Denied`

  returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^com.google.cloud.compute.v1.Denied prototype]
    (Denied/newBuilder prototype))
  (^com.google.cloud.compute.v1.Denied$Builder []
    (Denied/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Denied`"
  (^com.google.cloud.compute.v1.Denied []
    (Denied/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Denied this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Denied this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Denied this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Denied this]
    (-> this (.getApiMessageRequestBody))))

(defn get-ip-protocol
  "The IP protocol to which this rule applies. The protocol type is required when creating a
   firewall rule. This value can either be one of the following well known protocol strings (tcp,
   udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.

  returns: `java.lang.String`"
  (^java.lang.String [^Denied this]
    (-> this (.getIPProtocol))))

(defn get-ports-list
  "An optional list of ports to which this rule applies. This field is only applicable for UDP or
   TCP protocol. Each entry must be either an integer or a range. If not specified, this rule
   applies to connections through any port.

   Example inputs include: [\"22\"], [\"80\",\"443\"], and [\"12345-12349\"].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Denied this]
    (-> this (.getPortsList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Denied this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Denied this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Denied$Builder`"
  (^com.google.cloud.compute.v1.Denied$Builder [^Denied this]
    (-> this (.toBuilder))))

