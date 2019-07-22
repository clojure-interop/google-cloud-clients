(ns com.google.cloud.compute.v1.TargetTcpProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetTcpProxy`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^com.google.cloud.compute.v1.TargetTcpProxy prototype]
    (TargetTcpProxy/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder []
    (TargetTcpProxy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetTcpProxy`"
  (^com.google.cloud.compute.v1.TargetTcpProxy []
    (TargetTcpProxy/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetTcpProxy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetTcpProxy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getName))))

(defn get-service
  "URL to the BackendService resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getService))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE or
   PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getProxyHeader))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetTcpProxy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetTcpProxy this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetTcpProxy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy this]
    (-> this (.toBuilder))))

