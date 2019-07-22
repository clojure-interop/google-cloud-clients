(ns com.google.cloud.compute.v1.PathMatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PathMatcher]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.PathMatcher`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^com.google.cloud.compute.v1.PathMatcher prototype]
    (PathMatcher/newBuilder prototype))
  (^com.google.cloud.compute.v1.PathMatcher$Builder []
    (PathMatcher/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.PathMatcher`"
  (^com.google.cloud.compute.v1.PathMatcher []
    (PathMatcher/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PathMatcher this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^PathMatcher this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name to which this PathMatcher is referred by the HostRule.

  returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher this]
    (-> this (.getDescription))))

(defn get-path-rules-list
  "The list of path rules. Use this list instead of routeRules when routing based on simple path
   matching is all that's required. The order by which path rules are specified does not matter.
   Matches are always done on the longest-path-first basis. For example: a pathRule with a path
   /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear
   in this list. Only one of pathRules or routeRules must be set.

  returns: `java.util.List<com.google.cloud.compute.v1.PathRule>`"
  (^java.util.List [^PathMatcher this]
    (-> this (.getPathRulesList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^PathMatcher this]
    (-> this (.getApiMessageRequestBody))))

(defn get-default-service
  "The full or partial URL to the BackendService resource. This will be used if none of the
   pathRules or routeRules defined by this PathMatcher are matched. For example, the following are
   all valid URLs to a BackendService resource: -
   https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService -
   compute/v1/projects/project/global/backendServices/backendService -
   global/backendServices/backendService If defaultRouteAction is additionally specified, advanced
   routing actions like URL Rewrites, etc. take effect prior to sending the request to the
   backend. However, if defaultService is specified, defaultRouteAction cannot contain any
   weightedBackendServices. Conversely, if defaultRouteAction specifies any
   weightedBackendServices, defaultService must not be specified. Only one of defaultService,
   defaultUrlRedirect or defaultRouteAction.weightedBackendService must be set. Authorization
   requires one or more of the following Google IAM permissions on the specified resource
   default_service: - compute.backendBuckets.use - compute.backendServices.use

  returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher this]
    (-> this (.getDefaultService))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PathMatcher this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PathMatcher this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher this]
    (-> this (.toBuilder))))

