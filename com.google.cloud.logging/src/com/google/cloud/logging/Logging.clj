(ns com.google.cloud.logging.Logging
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Logging]))

(defn delete-metric-async
  "Sends a request for deleting a metric. This method returns a ApiFuture object to
   consume the result. Future.get() returns true if the metric was deleted,
   false if it was not found.

   Example of asynchronously deleting a metric.



   String metricName = \"my_metric_name\";
   ApiFuture<Boolean> future = logging.deleteMetricAsync(metricName);
   // ...
   boolean deleted = future.get();
   if (deleted) {
     // the metric was deleted
   } else {
     // the metric was not found
   }

  metric - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`"
  (^com.google.api.core.ApiFuture [^Logging this ^java.lang.String metric]
    (-> this (.deleteMetricAsync metric))))

(defn get-flush-severity
  "returns: `com.google.cloud.logging.Severity`"
  (^com.google.cloud.logging.Severity [^Logging this]
    (-> this (.getFlushSeverity))))

(defn list-metrics
  "Lists the metrics. This method returns a Page object that can be used to consume
   paginated results. Use Logging.ListOption to specify the page size or the page token from which
   to start listing metrics.

   Example of listing metrics, specifying the page size.



   Page<Metric> metrics = logging.listMetrics(ListOption.pageSize(100));
   Iterator<Metric> metricIterator = metrics.iterateAll();
   while (metricIterator.hasNext()) {
     Metric metric = metricIterator.next();
     // do something with the metric
   }

  options - `com.google.cloud.logging.Logging$ListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.logging.Metric>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.gax.paging.Page [^Logging this ^com.google.cloud.logging.Logging$ListOption options]
    (-> this (.listMetrics options))))

(defn list-monitored-resource-descriptors
  "Lists the monitored resource descriptors used by Stackdriver Logging. This method returns a
   Page object that can be used to consume paginated results. Use Logging.ListOption to
   specify the page size or the page token from which to start listing resource descriptors.

   Example of listing monitored resource descriptors, specifying the page size.



   Page<MonitoredResourceDescriptor> descriptors =
       logging.listMonitoredResourceDescriptors(ListOption.pageSize(100));
   Iterator<MonitoredResourceDescriptor> descriptorIterator = descriptors.iterateAll();
   while (descriptorIterator.hasNext()) {
     MonitoredResourceDescriptor descriptor = descriptorIterator.next();
     // do something with the descriptor
   }

  options - `com.google.cloud.logging.Logging$ListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.MonitoredResourceDescriptor>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.gax.paging.Page [^Logging this ^com.google.cloud.logging.Logging$ListOption options]
    (-> this (.listMonitoredResourceDescriptors options))))

(defn list-log-entries-async
  "Sends a request for listing log entries. This method returns a ApiFuture object to
   consume the result. Future.get() returns an AsyncPage object that can be
   used to asynchronously handle paginated results. Use Logging.EntryListOption.pageSize(int) to
   specify the page size. Use Logging.EntryListOption.pageToken(String) to specify the page token
   from which to start listing entries. Use EntryListOption#sortOrder(SortingField,
   SortingOrder) to sort log entries according to your preferred order (default is most-recent
   last). Use Logging.EntryListOption.filter(String) to filter listed log entries.

   Example of asynchronously listing log entries for a specific log.



   String filter = \"logName=projects/my_project_id/logs/my_log_name\";
   ApiFuture<AsyncPage<LogEntry>> future =
       logging.listLogEntriesAsync(EntryListOption.filter(filter));
   // ...
   AsyncPage<LogEntry> entries = future.get();
   Iterator<LogEntry> entryIterator = entries.iterateAll();
   while (entryIterator.hasNext()) {
     LogEntry entry = entryIterator.next();
     // do something with the entry
   }

  options - `com.google.cloud.logging.Logging$EntryListOption`

  returns: `com.google.api.core.ApiFuture<com.google.api.gax.paging.AsyncPage<com.google.cloud.logging.LogEntry>>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Logging this ^com.google.cloud.logging.Logging$EntryListOption options]
    (-> this (.listLogEntriesAsync options))))

(defn delete-log
  "Deletes a log and all its log entries. The log will reappear if new entries are written to it.

   Example of deleting a log.



   String logName = \"my_log_name\";
   boolean deleted = logging.deleteLog(logName);
   if (deleted) {
     // the log was deleted
   } else {
     // the log was not found
   }

  log - `java.lang.String`

  returns: true if the log was deleted, false if it was not found - `boolean`"
  (^Boolean [^Logging this ^java.lang.String log]
    (-> this (.deleteLog log))))

(defn list-sinks-async
  "Sends a request for listing sinks. This method returns a ApiFuture object to consume
   the result. Future.get() returns an AsyncPage object that can be used to
   asynchronously handle paginated results. Use Logging.ListOption to specify the page size or the
   page token from which to start listing sinks.

   Example of asynchronously listing sinks, specifying the page size.



   ApiFuture<AsyncPage<Sink>> future = logging.listSinksAsync(ListOption.pageSize(100));
   // ...
   AsyncPage<Sink> sinks = future.get();
   Iterator<Sink> sinkIterator = sinks.iterateAll();
   while (sinkIterator.hasNext()) {
     Sink sink = sinkIterator.next();
     // do something with the sink
   }

  options - `com.google.cloud.logging.Logging$ListOption`

  returns: `com.google.api.core.ApiFuture<com.google.api.gax.paging.AsyncPage<com.google.cloud.logging.Sink>>`"
  (^com.google.api.core.ApiFuture [^Logging this ^com.google.cloud.logging.Logging$ListOption options]
    (-> this (.listSinksAsync options))))

(defn delete-sink-async
  "Sends a request for deleting a sink. This method returns a ApiFuture object to consume
   the result. Future.get() returns true if the sink was deleted, false
   if it was not found.

   Example of asynchronously deleting a sink.



   String sinkName = \"my_sink_name\";
   ApiFuture<Boolean> future = logging.deleteSinkAsync(sinkName);
   // ...
   boolean deleted = future.get();
   if (deleted) {
     // the sink was deleted
   } else {
     // the sink was not found
   }

  sink - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`"
  (^com.google.api.core.ApiFuture [^Logging this ^java.lang.String sink]
    (-> this (.deleteSinkAsync sink))))

(defn get-metric
  "Returns the requested metric or null if not found.

   Example of getting a metric.



   String metricName = \"my_metric_name\";
   Metric metric = logging.getMetric(metricName);
   if (metric == null) {
     // metric was not found
   }

  metric - `java.lang.String`

  returns: `com.google.cloud.logging.Metric`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Metric [^Logging this ^java.lang.String metric]
    (-> this (.getMetric metric))))

(defn delete-metric
  "Deletes the requested metric.

   Example of deleting a metric.



   String metricName = \"my_metric_name\";
   boolean deleted = logging.deleteMetric(metricName);
   if (deleted) {
     // the metric was deleted
   } else {
     // the metric was not found
   }

  metric - `java.lang.String`

  returns: true if the metric was deleted, false if it was not found - `boolean`"
  (^Boolean [^Logging this ^java.lang.String metric]
    (-> this (.deleteMetric metric))))

(defn flush
  "Flushes any pending asynchronous logging writes. Logs are automatically flushed based on time
   and message count that be configured via BatchingSettings,
   Logs are also flushed if enabled, at or above flush severity, see setFlushSeverity(com.google.cloud.logging.Severity).
   Logging frameworks require support for an explicit flush. See usage in the java.util.logging
   handlerLoggingHandler."
  ([^Logging this]
    (-> this (.flush))))

(defn get-metric-async
  "Sends a request for getting a metric. This method returns a ApiFuture object to consume
   the result. Future.get() returns the requested metric or null if not found.

   Example of asynchronously getting a metric.



   String metricName = \"my_metric_name\";
   ApiFuture<Metric> future = logging.getMetricAsync(metricName);
   // ...
   Metric metric = future.get();
   if (metric == null) {
     // metric was not found
   }

  metric - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Metric>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Logging this ^java.lang.String metric]
    (-> this (.getMetricAsync metric))))

(defn update
  "Updates a sink or creates one if it does not exist.

   Example of updating a sink.



   String sinkName = \"my_sink_name\";
   String datasetName = \"my_dataset\";
   SinkInfo sinkInfo = SinkInfo.newBuilder(sinkName, DatasetDestination.of(datasetName))
       .setVersionFormat(SinkInfo.VersionFormat.V2)
       .setFilter(\"severity>=ERROR\")
       .build();
   Sink sink = logging.update(sinkInfo);

  sink - `com.google.cloud.logging.SinkInfo`

  returns: the created sink - `com.google.cloud.logging.Sink`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Sink [^Logging this ^com.google.cloud.logging.SinkInfo sink]
    (-> this (.update sink))))

(defn set-flush-severity
  "Sets flush severity for asynchronous logging writes. It is disabled by default, enabled when
   this method is called with not null value. Logs will be immediately written out for entries at
   or higher than flush severity.

   Enabling this can cause the leaking and hanging threads, see BUG(2796) BUG(3880). However
   you can explicitly call flush().

   TODO: Enable this by default once functionality to trigger rpc is available in generated
   code.

  flush-severity - `com.google.cloud.logging.Severity`"
  ([^Logging this ^com.google.cloud.logging.Severity flush-severity]
    (-> this (.setFlushSeverity flush-severity))))

(defn list-metrics-async
  "Sends a request for listing metrics. This method returns a ApiFuture object to consume
   the result. Future.get() returns an AsyncPage object that can be used to
   asynchronously handle paginated results. Use Logging.ListOption to specify the page size or the
   page token from which to start listing metrics.

   Example of asynchronously listing metrics, specifying the page size.



   ApiFuture<AsyncPage<Metric>> future = logging.listMetricsAsync(ListOption.pageSize(100));
   // ...
   AsyncPage<Metric> metrics = future.get();
   Iterator<Metric> metricIterator = metrics.iterateAll();
   while (metricIterator.hasNext()) {
     Metric metric = metricIterator.next();
     // do something with the metric
   }

  options - `com.google.cloud.logging.Logging$ListOption`

  returns: `com.google.api.core.ApiFuture<com.google.api.gax.paging.AsyncPage<com.google.cloud.logging.Metric>>`"
  (^com.google.api.core.ApiFuture [^Logging this ^com.google.cloud.logging.Logging$ListOption options]
    (-> this (.listMetricsAsync options))))

(defn list-sinks
  "Lists the sinks. This method returns a Page object that can be used to consume
   paginated results. Use Logging.ListOption to specify the page size or the page token from which
   to start listing sinks.

   Example of listing sinks, specifying the page size.



   Page<Sink> sinks = logging.listSinks(ListOption.pageSize(100));
   Iterator<Sink> sinkIterator = sinks.iterateAll();
   while (sinkIterator.hasNext()) {
     Sink sink = sinkIterator.next();
     // do something with the sink
   }

  options - `com.google.cloud.logging.Logging$ListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.logging.Sink>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.gax.paging.Page [^Logging this ^com.google.cloud.logging.Logging$ListOption options]
    (-> this (.listSinks options))))

(defn list-monitored-resource-descriptors-async
  "Sends a request for listing monitored resource descriptors used by Stackdriver Logging. This
   method returns a ApiFuture object to consume the result. Future.get()
   returns an AsyncPage object that can be used to asynchronously handle paginated
   results. Use Logging.ListOption to specify the page size or the page token from which to start
   listing resource descriptors.

   Example of asynchronously listing monitored resource descriptors, specifying the page size.



   ApiFuture<AsyncPage<MonitoredResourceDescriptor>> future =
       logging.listMonitoredResourceDescriptorsAsync(ListOption.pageSize(100));
   // ...
   AsyncPage<MonitoredResourceDescriptor> descriptors = future.get();
   Iterator<MonitoredResourceDescriptor> descriptorIterator = descriptors.iterateAll();
   while (descriptorIterator.hasNext()) {
     MonitoredResourceDescriptor descriptor = descriptorIterator.next();
     // do something with the descriptor
   }

  options - `com.google.cloud.logging.Logging$ListOption`

  returns: `com.google.api.core.ApiFuture<com.google.api.gax.paging.AsyncPage<com.google.cloud.MonitoredResourceDescriptor>>`"
  (^com.google.api.core.ApiFuture [^Logging this ^com.google.cloud.logging.Logging$ListOption options]
    (-> this (.listMonitoredResourceDescriptorsAsync options))))

(defn get-write-synchronicity
  "returns: `com.google.cloud.logging.Synchronicity`"
  (^com.google.cloud.logging.Synchronicity [^Logging this]
    (-> this (.getWriteSynchronicity))))

(defn create
  "Creates a new sink.

   Example of creating a sink to export logs to a BigQuery dataset (in the ServiceOptions.getProjectId() project).



   String sinkName = \"my_sink_name\";
   String datasetName = \"my_dataset\";
   SinkInfo sinkInfo = SinkInfo.of(sinkName, DatasetDestination.of(datasetName));
   Sink sink = logging.create(sinkInfo);

  sink - `com.google.cloud.logging.SinkInfo`

  returns: the created sink - `com.google.cloud.logging.Sink`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Sink [^Logging this ^com.google.cloud.logging.SinkInfo sink]
    (-> this (.create sink))))

(defn list-log-entries
  "Lists log entries. This method returns a Page object that can be used to consume
   paginated results. Use Logging.EntryListOption.pageSize(int) to specify the page size. Use
   Logging.EntryListOption.pageToken(String) to specify the page token from which to start listing
   entries. Use EntryListOption#sortOrder(SortingField, SortingOrder) to sort log entries
   according to your preferred order (default is most-recent last). Use Logging.EntryListOption.filter(String) to filter listed log entries.

   Example of listing log entries for a specific log.



   String filter = \"logName=projects/my_project_id/logs/my_log_name\";
   Page<LogEntry> entries = logging.listLogEntries(EntryListOption.filter(filter));
   Iterator<LogEntry> entryIterator = entries.iterateAll();
   while (entryIterator.hasNext()) {
     LogEntry entry = entryIterator.next();
     // do something with the entry
   }

  options - `com.google.cloud.logging.Logging$EntryListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.logging.LogEntry>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.gax.paging.Page [^Logging this ^com.google.cloud.logging.Logging$EntryListOption options]
    (-> this (.listLogEntries options))))

(defn delete-log-async
  "Sends a request for deleting a log and all its log entries. This method returns a ApiFuture object to consume the result. Future.get() returns true if the
   log was deleted, false if it was not found.

   Example of asynchronously deleting a log.



   String logName = \"my_log_name\";
   ApiFuture<Boolean> future = logging.deleteLogAsync(logName);
   // ...
   boolean deleted = future.get();
   if (deleted) {
     // the log was deleted
   } else {
     // the log was not found
   }

  log - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`"
  (^com.google.api.core.ApiFuture [^Logging this ^java.lang.String log]
    (-> this (.deleteLogAsync log))))

(defn create-async
  "Sends a request for creating a sink. This method returns a ApiFuture object to consume
   the result. Future.get() returns the created sink.

   Example of asynchronously creating a sink to export logs to a BigQuery dataset (in the
   ServiceOptions.getProjectId() project).



   String sinkName = \"my_sink_name\";
   String datasetName = \"my_dataset\";
   SinkInfo sinkInfo = SinkInfo.of(sinkName, DatasetDestination.of(datasetName));
   ApiFuture<Sink> future = logging.createAsync(sinkInfo);
   // ...
   Sink sink = future.get();

  sink - `com.google.cloud.logging.SinkInfo`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Sink>`"
  (^com.google.api.core.ApiFuture [^Logging this ^com.google.cloud.logging.SinkInfo sink]
    (-> this (.createAsync sink))))

(defn write
  "Sends a request to log entries to Stackdriver Logging. Use Logging.WriteOption.logName(String)
   to provide a log name for those entries that do not specify one. Use Logging.WriteOption.resource(MonitoredResource) to provide a monitored resource for those entries that
   do not specify one. Use Logging.WriteOption.labels(Map) to provide some labels to be added to
   every entry in logEntries.

   Example of writing log entries and providing a default log name and monitored resource.



   String logName = \"my_log_name\";
   List<LogEntry> entries = new ArrayList<>();
   entries.add(LogEntry.of(StringPayload.of(\"Entry payload\")));
   Map<String, Object> jsonMap = new HashMap<>();
   jsonMap.put(\"key\", \"value\");
   entries.add(LogEntry.of(JsonPayload.of(jsonMap)));
   logging.write(
       entries,
       WriteOption.logName(logName),
       WriteOption.resource(MonitoredResource.newBuilder(\"global\").build()));

  log-entries - `java.lang.Iterable`
  options - `com.google.cloud.logging.Logging$WriteOption`"
  ([^Logging this ^java.lang.Iterable log-entries ^com.google.cloud.logging.Logging$WriteOption options]
    (-> this (.write log-entries options))))

(defn get-sink
  "Returns the requested sink or null if not found.

   Example of getting a sink.



   String sinkName = \"my_sink_name\";
   Sink sink = logging.getSink(sinkName);
   if (sink == null) {
     // sink was not found
   }

  sink - `java.lang.String`

  returns: `com.google.cloud.logging.Sink`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Sink [^Logging this ^java.lang.String sink]
    (-> this (.getSink sink))))

(defn get-sink-async
  "Sends a request for getting a sink. This method returns a ApiFuture object to consume
   the result. Future.get() returns the requested sink or null if not found.

   Example of asynchronously getting a sink.



   String sinkName = \"my_sink_name\";
   ApiFuture<Sink> future = logging.getSinkAsync(sinkName);
   // ...
   Sink sink = future.get();
   if (sink == null) {
     // sink was not found
   }

  sink - `java.lang.String`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Sink>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Logging this ^java.lang.String sink]
    (-> this (.getSinkAsync sink))))

(defn delete-sink
  "Deletes the requested sink.

   Example of deleting a sink.



   String sinkName = \"my_sink_name\";
   boolean deleted = logging.deleteSink(sinkName);
   if (deleted) {
     // the sink was deleted
   } else {
     // the sink was not found
   }

  sink - `java.lang.String`

  returns: true if the sink was deleted, false if it was not found - `boolean`"
  (^Boolean [^Logging this ^java.lang.String sink]
    (-> this (.deleteSink sink))))

(defn set-write-synchronicity
  "synchronicity - `com.google.cloud.logging.Synchronicity`"
  ([^Logging this ^com.google.cloud.logging.Synchronicity synchronicity]
    (-> this (.setWriteSynchronicity synchronicity))))

(defn update-async
  "Sends a request for updating a sink (or creating it, if it does not exist). This method returns
   a ApiFuture object to consume the result. Future.get() returns the
   updated/created sink or null if not found.

   Example of asynchronously updating a sink.



   String sinkName = \"my_sink_name\";
   String datasetName = \"my_dataset\";
   SinkInfo sinkInfo = SinkInfo.newBuilder(sinkName, DatasetDestination.of(datasetName))
       .setVersionFormat(SinkInfo.VersionFormat.V2)
       .setFilter(\"severity>=ERROR\")
       .build();
   ApiFuture<Sink> future = logging.updateAsync(sinkInfo);
   // ...
   Sink sink = future.get();

  sink - `com.google.cloud.logging.SinkInfo`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Sink>`"
  (^com.google.api.core.ApiFuture [^Logging this ^com.google.cloud.logging.SinkInfo sink]
    (-> this (.updateAsync sink))))

