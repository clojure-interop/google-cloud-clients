(ns com.google.cloud.dns.ChangeRequest$Builder
  "A builder for ChangeRequests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ChangeRequest$Builder]))

(defn delete
  "Description copied from class: ChangeRequestInfo.Builder

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.delete record-set))))

(defn clear-deletions
  "Description copied from class: ChangeRequestInfo.Builder

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this]
    (-> this (.clearDeletions))))

(defn remove-deletion
  "Description copied from class: ChangeRequestInfo.Builder

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.removeDeletion record-set))))

(defn build
  "Description copied from class: ChangeRequestInfo.Builder

  returns: `com.google.cloud.dns.ChangeRequest`"
  (^com.google.cloud.dns.ChangeRequest [^ChangeRequest$Builder this]
    (-> this (.build))))

(defn set-additions
  "Description copied from class: ChangeRequestInfo.Builder

  additions - `java.util.List`

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this ^java.util.List additions]
    (-> this (.setAdditions additions))))

(defn set-deletions
  "Description copied from class: ChangeRequestInfo.Builder

  deletions - `java.util.List`

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this ^java.util.List deletions]
    (-> this (.setDeletions deletions))))

(defn add
  "Description copied from class: ChangeRequestInfo.Builder

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.add record-set))))

(defn remove-addition
  "Description copied from class: ChangeRequestInfo.Builder

  record-set - `com.google.cloud.dns.RecordSet`

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this ^com.google.cloud.dns.RecordSet record-set]
    (-> this (.removeAddition record-set))))

(defn clear-additions
  "Description copied from class: ChangeRequestInfo.Builder

  returns: `com.google.cloud.dns.ChangeRequest$Builder`"
  (^com.google.cloud.dns.ChangeRequest$Builder [^ChangeRequest$Builder this]
    (-> this (.clearAdditions))))

