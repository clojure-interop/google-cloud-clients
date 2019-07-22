(ns com.google.cloud.compute.v1.TargetHttpProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpProxy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetHttpProxy`

  returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^com.google.cloud.compute.v1.TargetHttpProxy prototype]
    (TargetHttpProxy/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder []
    (TargetHttpProxy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetHttpProxy`"
  (^com.google.cloud.compute.v1.TargetHttpProxy []
    (TargetHttpProxy/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetHttpProxy for target HTTP proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpProxy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetHttpProxy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getName))))

(defn get-url-map
  "URL to the UrlMap resource that defines the mapping from URL to the BackendService.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getUrlMap))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetHttpProxy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetHttpProxy this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpProxy this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetHttpProxy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetHttpProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpProxy$Builder [^TargetHttpProxy this]
    (-> this (.toBuilder))))

