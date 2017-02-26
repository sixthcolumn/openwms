module CrewsHelper

def get_crew_name(crew)
if crew && crew.crew_names.first.nil?
      ""
else
      "#{crew.crew_names.first.name}(#{crew.crew_names.length})"


end

end

def get_crew_num_assets(crew)
    if crew && crew.assets
        crew.assets.length
    else
       0
    end
end
end
