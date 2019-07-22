(ns com.google.cloud.compute.v1.UrlMap
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMap]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UrlMap`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^com.google.cloud.compute.v1.UrlMap prototype]
    (UrlMap/newBuilder prototype))
  (^com.google.cloud.compute.v1.UrlMap$Builder []
    (UrlMap/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UrlMap`"
  (^com.google.cloud.compute.v1.UrlMap []
    (UrlMap/getDefaultInstance )))

(defn get-tests-list
  "The list of expected URL mapping tests. Request to update this UrlMap will succeed only if all
   of the test cases pass. You can specify a maximum of 100 tests per UrlMap.

  returns: `java.util.List<com.google.cloud.compute.v1.UrlMapTest>`"
  (^java.util.List [^UrlMap this]
    (-> this (.getTestsList))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#urlMaps for url maps.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getKind))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a UrlMap.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMap this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UrlMap this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^UrlMap this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getSelfLink))))

(defn get-default-service
  "The full or partial URL of the defaultService resource to which traffic is directed if none of
   the hostRules match. If defaultRouteAction is additionally specified, advanced routing actions
   like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if
   defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices.
   Conversely, if routeAction specifies any weightedBackendServices, service must not be
   specified. Only one of defaultService, defaultUrlRedirect or
   defaultRouteAction.weightedBackendService must be set.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getDefaultService))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UrlMap this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap this]
    (-> this (.getCreationTimestamp))))

(defn get-path-matchers-list
  "The list of named PathMatchers to use against the URL.

  returns: `java.util.List<com.google.cloud.compute.v1.PathMatcher>`"
  (^java.util.List [^UrlMap this]
    (-> this (.getPathMatchersList))))

(defn get-host-rules-list
  "The list of HostRules to use against the URL.

  returns: `java.util.List<com.google.cloud.compute.v1.HostRule>`"
  (^java.util.List [^UrlMap this]
    (-> this (.getHostRulesList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UrlMap this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap this]
    (-> this (.toBuilder))))

