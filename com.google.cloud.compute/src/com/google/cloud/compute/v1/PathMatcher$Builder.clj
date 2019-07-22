(ns com.google.cloud.compute.v1.PathMatcher$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PathMatcher$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-name
  "The name to which this PathMatcher is referred by the HostRule.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-path-rules
  "The list of path rules. Use this list instead of routeRules when routing based on simple path
   matching is all that's required. The order by which path rules are specified does not matter.
   Matches are always done on the longest-path-first basis. For example: a pathRule with a path
   /a/b/c/* will match before /a/b/* irrespective of the order in which those paths
   appear in this list. Only one of pathRules or routeRules must be set.

  path-rules - `com.google.cloud.compute.v1.PathRule`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this ^com.google.cloud.compute.v1.PathRule path-rules]
    (-> this (.addPathRules path-rules))))

(defn set-default-service
  "The full or partial URL to the BackendService resource. This will be used if none of the
   pathRules or routeRules defined by this PathMatcher are matched. For example, the following
   are all valid URLs to a BackendService resource: -
   https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
   - compute/v1/projects/project/global/backendServices/backendService -
   global/backendServices/backendService If defaultRouteAction is additionally specified,
   advanced routing actions like URL Rewrites, etc. take effect prior to sending the request to
   the backend. However, if defaultService is specified, defaultRouteAction cannot contain any
   weightedBackendServices. Conversely, if defaultRouteAction specifies any
   weightedBackendServices, defaultService must not be specified. Only one of defaultService,
   defaultUrlRedirect or defaultRouteAction.weightedBackendService must be set. Authorization
   requires one or more of the following Google IAM permissions on the specified resource
   default_service: - compute.backendBuckets.use - compute.backendServices.use

  default-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this ^java.lang.String default-service]
    (-> this (.setDefaultService default-service))))

(defn get-name
  "The name to which this PathMatcher is referred by the HostRule.

  returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher$Builder this]
    (-> this (.getName))))

(defn build
  "returns: `com.google.cloud.compute.v1.PathMatcher`"
  (^com.google.cloud.compute.v1.PathMatcher [^PathMatcher$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher$Builder this]
    (-> this (.getDescription))))

(defn get-path-rules-list
  "The list of path rules. Use this list instead of routeRules when routing based on simple path
   matching is all that's required. The order by which path rules are specified does not matter.
   Matches are always done on the longest-path-first basis. For example: a pathRule with a path
   /a/b/c/* will match before /a/b/* irrespective of the order in which those paths
   appear in this list. Only one of pathRules or routeRules must be set.

  returns: `java.util.List<com.google.cloud.compute.v1.PathRule>`"
  (^java.util.List [^PathMatcher$Builder this]
    (-> this (.getPathRulesList))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.PathMatcher`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this ^com.google.cloud.compute.v1.PathMatcher other]
    (-> this (.mergeFrom other))))

(defn get-default-service
  "The full or partial URL to the BackendService resource. This will be used if none of the
   pathRules or routeRules defined by this PathMatcher are matched. For example, the following
   are all valid URLs to a BackendService resource: -
   https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
   - compute/v1/projects/project/global/backendServices/backendService -
   global/backendServices/backendService If defaultRouteAction is additionally specified,
   advanced routing actions like URL Rewrites, etc. take effect prior to sending the request to
   the backend. However, if defaultService is specified, defaultRouteAction cannot contain any
   weightedBackendServices. Conversely, if defaultRouteAction specifies any
   weightedBackendServices, defaultService must not be specified. Only one of defaultService,
   defaultUrlRedirect or defaultRouteAction.weightedBackendService must be set. Authorization
   requires one or more of the following Google IAM permissions on the specified resource
   default_service: - compute.backendBuckets.use - compute.backendServices.use

  returns: `java.lang.String`"
  (^java.lang.String [^PathMatcher$Builder this]
    (-> this (.getDefaultService))))

(defn clone
  "returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this]
    (-> this (.clone))))

(defn add-all-path-rules
  "The list of path rules. Use this list instead of routeRules when routing based on simple path
   matching is all that's required. The order by which path rules are specified does not matter.
   Matches are always done on the longest-path-first basis. For example: a pathRule with a path
   /a/b/c/* will match before /a/b/* irrespective of the order in which those paths
   appear in this list. Only one of pathRules or routeRules must be set.

  path-rules - `java.util.List`

  returns: `com.google.cloud.compute.v1.PathMatcher$Builder`"
  (^com.google.cloud.compute.v1.PathMatcher$Builder [^PathMatcher$Builder this ^java.util.List path-rules]
    (-> this (.addAllPathRules path-rules))))

