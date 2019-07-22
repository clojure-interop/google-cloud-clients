(ns com.google.cloud.compute.v1.TargetTcpProxy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxy$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-service
  "URL to the BackendService resource.

  service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String service]
    (-> this (.setService service))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getKind))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-service
  "URL to the BackendService resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getService))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE
   or PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getProxyHeader))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetTcpProxy`"
  (^com.google.cloud.compute.v1.TargetTcpProxy [^TargetTcpProxy$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn set-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE
   or PROXY_V1. The default is NONE.

  proxy-header - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^java.lang.String proxy-header]
    (-> this (.setProxyHeader proxy-header))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetTcpProxy`

  returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this ^com.google.cloud.compute.v1.TargetTcpProxy other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetTcpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxy$Builder [^TargetTcpProxy$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxy$Builder this]
    (-> this (.getCreationTimestamp))))

