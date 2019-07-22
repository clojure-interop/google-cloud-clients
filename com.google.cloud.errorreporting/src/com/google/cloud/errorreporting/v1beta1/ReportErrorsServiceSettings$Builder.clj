(ns com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder
  "Builder for ReportErrorsServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ReportErrorsServiceSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder [^ReportErrorsServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder [^ReportErrorsServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn report-error-event-settings
  "Returns the builder for the settings used for calls to reportErrorEvent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest,com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ReportErrorsServiceSettings$Builder this]
    (-> this (.reportErrorEventSettings))))

(defn build
  "returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings [^ReportErrorsServiceSettings$Builder this]
    (-> this (.build))))

