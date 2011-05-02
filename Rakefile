task :default => [:cuke]
  
desc "Runs Cucumber using Cuke4Duke"
task :cuke do 
  sh "jruby -J-cp src -S cuke4duke --jars lib"
end