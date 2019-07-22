(ns com.google.cloud.compute.v1.UrlMap$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMap$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-tests
  "The list of expected URL mapping tests. Request to update this UrlMap will succeed only if
   all of the test cases pass. You can specify a maximum of 100 tests per UrlMap.

  tests - `com.google.cloud.compute.v1.UrlMapTest`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^com.google.cloud.compute.v1.UrlMapTest tests]
    (-> this (.addTests tests))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-tests-list
  "The list of expected URL mapping tests. Request to update this UrlMap will succeed only if
   all of the test cases pass. You can specify a maximum of 100 tests per UrlMap.

  returns: `java.util.List<com.google.cloud.compute.v1.UrlMapTest>`"
  (^java.util.List [^UrlMap$Builder this]
    (-> this (.getTestsList))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#urlMaps for url maps.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getKind))))

(defn add-all-tests
  "The list of expected URL mapping tests. Request to update this UrlMap will succeed only if
   all of the test cases pass. You can specify a maximum of 100 tests per UrlMap.

  tests - `java.util.List`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.util.List tests]
    (-> this (.addAllTests tests))))

(defn set-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a UrlMap.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn add-all-path-matchers
  "The list of named PathMatchers to use against the URL.

  path-matchers - `java.util.List`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.util.List path-matchers]
    (-> this (.addAllPathMatchers path-matchers))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve a UrlMap.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getFingerprint))))

(defn add-all-host-rules
  "The list of HostRules to use against the URL.

  host-rules - `java.util.List`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.util.List host-rules]
    (-> this (.addAllHostRules host-rules))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#urlMaps for url maps.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-default-service
  "The full or partial URL of the defaultService resource to which traffic is directed if none
   of the hostRules match. If defaultRouteAction is additionally specified, advanced routing
   actions like URL Rewrites, etc. take effect prior to sending the request to the backend.
   However, if defaultService is specified, defaultRouteAction cannot contain any
   weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices,
   service must not be specified. Only one of defaultService, defaultUrlRedirect or
   defaultRouteAction.weightedBackendService must be set.

  default-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String default-service]
    (-> this (.setDefaultService default-service))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.UrlMap`"
  (^com.google.cloud.compute.v1.UrlMap [^UrlMap$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UrlMap`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^com.google.cloud.compute.v1.UrlMap other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getSelfLink))))

(defn get-default-service
  "The full or partial URL of the defaultService resource to which traffic is directed if none
   of the hostRules match. If defaultRouteAction is additionally specified, advanced routing
   actions like URL Rewrites, etc. take effect prior to sending the request to the backend.
   However, if defaultService is specified, defaultRouteAction cannot contain any
   weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices,
   service must not be specified. Only one of defaultService, defaultUrlRedirect or
   defaultRouteAction.weightedBackendService must be set.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getDefaultService))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this]
    (-> this (.clone))))

(defn add-host-rules
  "The list of HostRules to use against the URL.

  host-rules - `com.google.cloud.compute.v1.HostRule`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^com.google.cloud.compute.v1.HostRule host-rules]
    (-> this (.addHostRules host-rules))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^UrlMap$Builder this]
    (-> this (.getCreationTimestamp))))

(defn add-path-matchers
  "The list of named PathMatchers to use against the URL.

  path-matchers - `com.google.cloud.compute.v1.PathMatcher`

  returns: `com.google.cloud.compute.v1.UrlMap$Builder`"
  (^com.google.cloud.compute.v1.UrlMap$Builder [^UrlMap$Builder this ^com.google.cloud.compute.v1.PathMatcher path-matchers]
    (-> this (.addPathMatchers path-matchers))))

(defn get-path-matchers-list
  "The list of named PathMatchers to use against the URL.

  returns: `java.util.List<com.google.cloud.compute.v1.PathMatcher>`"
  (^java.util.List [^UrlMap$Builder this]
    (-> this (.getPathMatchersList))))

(defn get-host-rules-list
  "The list of HostRules to use against the URL.

  returns: `java.util.List<com.google.cloud.compute.v1.HostRule>`"
  (^java.util.List [^UrlMap$Builder this]
    (-> this (.getHostRulesList))))

