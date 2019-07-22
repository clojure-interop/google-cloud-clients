(ns com.google.cloud.compute.v1.InterconnectOutageNotification$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectOutageNotification$Builder]))

(defn set-description
  "A description about the purpose of the outage.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-affected-circuits
  "If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs that will be
   affected.

  affected-circuits - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String affected-circuits]
    (-> this (.addAffectedCircuits affected-circuits))))

(defn set-issue-type
  "Form this outage is expected to take, which can take one of the following values: - OUTAGE:
   The Interconnect may be completely out of service for some or all of the specified window. -
   PARTIAL_OUTAGE: Some circuits comprising the Interconnect as a whole should remain up, but
   with reduced bandwidth. Note that the versions of this enum prefixed with \"IT_\" have been
   deprecated in favor of the unprefixed values.

  issue-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String issue-type]
    (-> this (.setIssueType issue-type))))

(defn get-start-time
  "Scheduled start time for the outage (milliseconds since Unix epoch).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getStartTime))))

(defn get-affected-circuits-list
  "If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs that will be
   affected.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectOutageNotification$Builder this]
    (-> this (.getAffectedCircuitsList))))

(defn add-all-affected-circuits
  "If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs that will be
   affected.

  affected-circuits - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.util.List affected-circuits]
    (-> this (.addAllAffectedCircuits affected-circuits))))

(defn set-name
  "Unique identifier for this outage notification.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-state
  "State of this notification, which can take one of the following values: - ACTIVE: This outage
   notification is active. The event could be in the past, present, or future. See start_time
   and end_time for scheduling. - CANCELLED: The outage associated with this notification was
   cancelled before the outage was due to start. Note that the versions of this enum prefixed
   with \"NS_\" have been deprecated in favor of the unprefixed values.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn set-start-time
  "Scheduled start time for the outage (milliseconds since Unix epoch).

  start-time - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String start-time]
    (-> this (.setStartTime start-time))))

(defn get-name
  "Unique identifier for this outage notification.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getName))))

(defn get-state
  "State of this notification, which can take one of the following values: - ACTIVE: This outage
   notification is active. The event could be in the past, present, or future. See start_time
   and end_time for scheduling. - CANCELLED: The outage associated with this notification was
   cancelled before the outage was due to start. Note that the versions of this enum prefixed
   with \"NS_\" have been deprecated in favor of the unprefixed values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getState))))

(defn get-source
  "The party that generated this notification, which can take the following value: - GOOGLE:
   this notification as generated by Google. Note that the value of NSRC_GOOGLE has been
   deprecated in favor of GOOGLE.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getSource))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectOutageNotification`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification [^InterconnectOutageNotification$Builder this]
    (-> this (.build))))

(defn get-description
  "A description about the purpose of the outage.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getDescription))))

(defn set-end-time
  "Scheduled end time for the outage (milliseconds since Unix epoch).

  end-time - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String end-time]
    (-> this (.setEndTime end-time))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectOutageNotification`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^com.google.cloud.compute.v1.InterconnectOutageNotification other]
    (-> this (.mergeFrom other))))

(defn get-end-time
  "Scheduled end time for the outage (milliseconds since Unix epoch).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getEndTime))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this]
    (-> this (.clone))))

(defn get-issue-type
  "Form this outage is expected to take, which can take one of the following values: - OUTAGE:
   The Interconnect may be completely out of service for some or all of the specified window. -
   PARTIAL_OUTAGE: Some circuits comprising the Interconnect as a whole should remain up, but
   with reduced bandwidth. Note that the versions of this enum prefixed with \"IT_\" have been
   deprecated in favor of the unprefixed values.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectOutageNotification$Builder this]
    (-> this (.getIssueType))))

(defn set-source
  "The party that generated this notification, which can take the following value: - GOOGLE:
   this notification as generated by Google. Note that the value of NSRC_GOOGLE has been
   deprecated in favor of GOOGLE.

  source - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectOutageNotification$Builder`"
  (^com.google.cloud.compute.v1.InterconnectOutageNotification$Builder [^InterconnectOutageNotification$Builder this ^java.lang.String source]
    (-> this (.setSource source))))

