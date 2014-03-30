(defproject throttler "0.1.0"
  :description "Control the rate of message passing and function invocations"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [criterium "0.4.3"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
