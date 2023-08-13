echo "Committing Build and Name Versions"
git config --global user.email "actions@github.com"
git config --global user.name "Git Actions"
git tag -a "v$moduleVersion.$moduleBuild" -m "version v$moduleVersion.($moduleBuild)"
git push origin "v$moduleVersion.$moduleBuild"